package dev.ranieri.daos;

import java.lang.reflect.Field;

public interface CRUDdao<T> {

	public T create(T t);
	
	public T getById(T t);
	
	default public T delete(T t) throws IllegalArgumentException, IllegalAccessException {
		
		Class c = t.getClass();
		String entityname = c.getName();
		Field[] fields = c.getFields();
		String idFieldName = "";
		int value = 0;
		
		for(Field f :fields) {
			String name = f.getName();
			
			if(name.endsWith("Id"))
				idFieldName = name;
				value = f.getInt(f);
				
		}
		
		String sql = "DELETE FROM " +entityname+ "WHERE "+ idFieldName + "= " + value;
		
		return t;
	};
	
	public T update(T t);
	
}
