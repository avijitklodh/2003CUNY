package codes.newell.utilities;

import java.sql.ResultSet;
import java.util.List;

public interface QueryManager {
	ResultSet executeWithParameters(List<Object> parameters) throws NoSuchMethodException;
}
