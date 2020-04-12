package codes.newell.utilities;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

public class QueryBuilder {

	private static enum Types {
		CREATE, SELECT_WHERE, SELECT_ALL, UPDATE, DELETE;
	}

	public static final Types CREATE = Types.CREATE;
	public static final Types SELECT_ALL = Types.SELECT_ALL;
	public static final Types SELECT_WHERE = Types.SELECT_WHERE;
	public static final Types UPDATE = Types.UPDATE;
	public static final Types DELETE = Types.DELETE;

	private Field[] fields;
	private Set<String> excludedFields = new HashSet<>();
	private StringJoiner query = new StringJoiner(" ");
	private Types type;
	private String whereClause = "where id = ?";

	public QueryBuilder(Class<?> reference, Types type) {
		this.type = type;
		this.excludedFields.add("id");

		switch (type) {
		case CREATE:
			query.add("insert into");
			break;
		case SELECT_ALL:
			query.add("select * from");
			break;
		case SELECT_WHERE:
			query.add("select * from");
			break;
		case UPDATE:
			query.add("update");
			break;
		case DELETE:
			query.add("delete from");
			break;
		}

		fields = reference.getDeclaredFields();
		String name = '"' + reference.getSimpleName().toLowerCase() + '"';
		query.add(name);

		if (type == UPDATE) {
			query.add("set");
		}
	}

	public void excludeFieldsByName(Set<String> fieldNames) {
		this.excludedFields.addAll(fieldNames);
	}

	public void excludeFieldByName(String fieldName) {
		this.excludedFields.add(fieldName);
	}

	public void customWhereClause(String clause) {
		this.whereClause = clause;
	}

	public String buildQuery() {
		switch (this.type) {
		case CREATE:
			createBuilder();
			break;
		case SELECT_ALL:
			break;
		case SELECT_WHERE:
			addWhereClause();
			break;
		case UPDATE:
			updateBuilder();
			break;
		case DELETE:
			addWhereClause();
			break;
		}
		return query.toString();
	}

	private void createBuilder() {
		StringJoiner valueList = new StringJoiner(", ", "(", ")");
		StringJoiner psList = new StringJoiner(", ", "(", ")");
		for (Field f : fields) {
			if (!excludedFields.contains(f.getName())) {
				valueList.add(f.getName());
				psList.add("?");
			}
		}
		query.add(valueList.toString());
		query.add("values");
		query.add(psList.toString());
	}

	private void addWhereClause() {
		query.add(whereClause);
	}

	private void updateBuilder() {
		StringJoiner valueList = new StringJoiner(" = ?, ", "", " = ?");
		for (Field f : fields) {
			if (!excludedFields.contains(f.getName())) {
				valueList.add(f.getName());
			}
		}
		query.add(valueList.toString());
		query.add(whereClause);
	}
}
