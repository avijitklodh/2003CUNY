package codes.newell.utilities;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import codes.newell.entities.User;

public class BeanBuilder<C> {

	private C bean;
	private Map<String, PropertyDescriptor> properties = new HashMap<>();

	private static Map<Class<?>, Class<?>> wrapper = new HashMap<>();
	static {
		wrapper.put(int.class, Integer.class);
		wrapper.put(double.class, Double.class);
	}

	public BeanBuilder(C bean, Class<C> klass) {
		this.bean = bean;
		try {
			BeanInfo info = Introspector.getBeanInfo(klass);
			PropertyDescriptor[] pList = info.getPropertyDescriptors();
			Map<String, String> names = new HashMap<>();
			for (Field f : User.class.getDeclaredFields()) {
				names.put(f.getAnnotation(Bean.class).value(), f.getName());
			}
			for (PropertyDescriptor p : pList) {
				this.properties.put(names.get(p.getName()), p);
			}
		} catch (IntrospectionException e) {
			throw new RuntimeException("Error reading bean class");
		}
	}

	public BeanBuilder(Class<C> klass) throws InstantiationException, IllegalAccessException {
		this(klass.newInstance(), klass);
	}

	@SuppressWarnings("unchecked")
	private static <T> T assignValue(Class<T> type, String value) {
		if (type.getCanonicalName() == "java.lang.String") {
			return (T) value;
		} else if (type.getCanonicalName() == "boolean") {
			return (T) new Boolean(value == "1" ? true : false);
		}
		try {
			return (T) wrapper.get(type).getConstructor(String.class).newInstance(value);
		} catch (RuntimeException e) {
			throw e;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

	public C buildFrom(ResultSet rs) throws SQLException {
		ResultSetMetaData md = rs.getMetaData();
		for (int i = 1; i <= md.getColumnCount(); i++) {
			String name = md.getColumnName(i);
			String val = rs.getString(name);
			Class<?> type;
			try {
				type = properties.get(name).getPropertyType();
			} catch (NullPointerException e) {
				e.getMessage();
				e.getStackTrace();
				return bean;
			}
			try {
				properties.get(name).getWriteMethod().invoke(bean, assignValue(type, val));
			} catch (Exception e) {
				throw new RuntimeException("Error casting SQL values to bean");
			}
		}
		return bean;
	}

}
