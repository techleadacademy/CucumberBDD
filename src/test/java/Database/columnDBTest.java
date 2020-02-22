package Database;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class columnDBTest {

    String dbURL = "jdbc:oracle:thin:@ec2-3-208-12-213.compute-1.amazonaws.com:1521:xe";
    String dbUsername = "hr";
    String dbPassword = "hr";

    // query the  * details for employees whos employee_ID in (150 or 160)
    // select * from employees where employee_id in (150,160)
    @Test
    public void getID() throws SQLException {
        Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String query = "Select * from departments where location_id in (1400,1500)";
        ResultSet resultSet = statement.executeQuery(query);
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

        List<Map<String, Object>> mapList = new ArrayList<>();
        int columnCount = resultSetMetaData.getColumnCount();
        while (resultSet.next()) {
            Map<String, Object> rowMap = new HashMap<>();
            for (int i = 1; i <= columnCount; i++) {
                rowMap.put(resultSetMetaData.getColumnName(i), resultSet.getObject(i));
            }
            mapList.add(rowMap);
        }
        for (Map<String, Object> a : mapList) {
            System.out.println(a);
        }

    }
}

