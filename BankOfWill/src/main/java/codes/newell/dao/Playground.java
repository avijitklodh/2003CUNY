package codes.newell.dao;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import codes.newell.entities.Account;
import codes.newell.entities.User;
import codes.newell.utilities.ConnectionFactory;
import codes.newell.utilities.ConnectionManager;
import codes.newell.utilities.QueryBuilder;

public class Playground {
	private static void updateAccount(Account account, ResultSet rs) throws SQLException {
		account.setId(rs.getInt("id"));
		account.setBalance(rs.getDouble("balance"));
		account.setNickname(rs.getString("nickname"));
	}

	private static Account buildAccount(ResultSet rs) throws SQLException {
		Account account = new Account();
		updateAccount(account, rs);
		return account;
	}

	private static Map<Class<?>, Class<?>> wrapper = new HashMap<>();
	static {
		wrapper.put(int.class, Integer.class);
		wrapper.put(boolean.class, Boolean.class);
		wrapper.put(double.class, Double.class);
	}

	@SuppressWarnings("unchecked")
	private static <T> T assignValue(Class<T> klass, String value)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		if (klass.getCanonicalName() == "java.lang.String") {
			return (T) value;
		}

		try {
			return (T) wrapper.get(klass).getConstructor(String.class).newInstance(value);
		} catch (RuntimeException e) {
			throw e;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public static void main(String[] args) throws NoSuchMethodException, SQLException, IntrospectionException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		QueryBuilder qb = new QueryBuilder(Account.class, QueryBuilder.SELECT_WHERE);

		ConnectionManager cm = ConnectionFactory.buildManager(qb.buildQuery());
		ResultSet rs = cm.executeWithParameter(3);

		rs.next();
		System.out.println(buildAccount(rs).toString());

		Class<Account> acc = Account.class;
		BeanInfo info = Introspector.getBeanInfo(acc);
		PropertyDescriptor[] pList = info.getPropertyDescriptors();
		Map<String, PropertyDescriptor> properties = new HashMap<>();
		for (PropertyDescriptor p : pList) {
			properties.put(p.getName(), p);
		}

		Class<User> user = User.class;

		for (Field f : user.getDeclaredFields()) {
			// name of every field defined in the class
			f.getName();
		}
		for (Method m : user.getDeclaredMethods()) {
			m.getName();
			// see info about method parameter
			Parameter[] params = m.getParameters();
			// calls the method on the given instance with the given value
			m.invoke(new User(), "value");

			// Only visible at runtime if the annotation is annotated with
			// @Retention(RUNTIME)
			Annotation[] annos = m.getAnnotations();
		}

		Class<User> user = User.class;
		BeanInfo uinfo = Introspector.getBeanInfo(user);
		PropertyDescriptor[] uList = uinfo.getPropertyDescriptors();
		for (PropertyDescriptor p : uList) {
			System.out.println("PD   " + p.getName());
		}

		Account a = acc.newInstance();
		ResultSetMetaData md = rs.getMetaData();
		for (int i = 1; i <= md.getColumnCount(); i++) {
			String name = md.getColumnName(i);
			String val = rs.getString(name);
			Class<?> type = properties.get(name).getPropertyType();
			properties.get(name).getWriteMethod().invoke(a, assignValue(type, val));
		}

		System.out.println(a.toString());
	}

}
