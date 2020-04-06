package codes.newell.utilities;

import java.sql.ResultSet;
import java.util.List;

public interface ConnectionManager {
	ResultSet executeWithParameters(List<Object> parameters) throws NoSuchMethodException;

	ResultSet executeWithParameter(Object parameter) throws NoSuchMethodException;
}
