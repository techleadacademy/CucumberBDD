package Database;

import org.junit.Test;

import java.sql.*;
import java.util.*;


public class databaseConnection {

    // ec2-54-234-66-220.compute-1.amazonaws.com
    String dbURL = "jdbc:oracle:thin:@ec2-3-208-12-213.compute-1.amazonaws.com:1521:xe";
    String dbUsername = "hr";
    String dbPassword = "hr";

    /**
     * dbConnectionJDBC will set a connection to ORACLE DB
     * Connection takes dbURL, dbUsername, DbPassword as parameters
     * Statement will allow us to scroll
     * ResultSet will execute query
     * Example in executeQuery: select * from employees
     *
     * @throws SQLException
     * @Author Alex Rodriguez
     */

    @Test
    public void dbConnectionJDBC() throws SQLException {
        Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees");

        resultSet.last();
        int rowCount = resultSet.getRow();
        System.out.println("Row count : " + rowCount);

        resultSet.first();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1)
                    + " <-->" + resultSet.getString("first_name")
                    + " " + resultSet.getString("last_name"));
        }

        resultSet.close();
        statement.close();
        con.close();


    }


    /**
     * Write a Query that will print the count of employees working in department_id 100
     */

    @Test
    public void countofEmployeesInDep100() throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select count(first_name) from employees\n" +
                "where department_id = 100");

        resultSet.first();

        System.out.println(resultSet.getString(1));

        resultSet.last();
        int rowCount = resultSet.getRow();
        System.out.println("Row count : " + rowCount);


        resultSet.close();
        statement.close();
        connection.close();
    }

    /**
     * Query the first 5 employees in the table
     * select * from employees where rownum <=5
     */

    @Test
    public void countOfEmployeesInDep100() throws SQLException {
        Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);

        Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet = statement.executeQuery("select * from employees where rownum <= 5");

//        resultSet.first();
        while (resultSet.next())
            System.out.println(resultSet.getString(1) +
                    " <--->" + resultSet.getString("first_name") +
                    " " + resultSet.getString("last_name"));

        resultSet.close();
        statement.close();
        con.close();
    }
    @Test
    public void dbMetadata() throws SQLException {
        Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String query = "select employee_id, last_name, job_id, salary from employees";

        ResultSet resultSet = statement.executeQuery(query);

        // Database SQL  collect the metadata
        DatabaseMetaData dbMetadata = connection.getMetaData();
        System.out.println("User: " + dbMetadata.getUserName());
        System.out.println("Database type: " + dbMetadata.getDatabaseProductName());

        // Result set metadata
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        System.out.println("Columns count " + resultSetMetaData.getColumnCount());
        System.out.println(resultSetMetaData.getColumnName(1));
        System.out.println(resultSetMetaData.getColumnName(4));

        for (int i = 1; i <= resultSetMetaData.getColumnCount(); i++) {
            System.out.println(i + " ---> " + resultSetMetaData.getColumnName(i));
        }

        List<Map<String, Object>> mapList = new ArrayList<>();
        ResultSetMetaData resultSetMetaData1 = resultSet.getMetaData();

        int colCount = resultSetMetaData1.getColumnCount();

        while(resultSet.next()){
            Map<String, Object> rowMap = new HashMap<>();
            // TODO loop and print results for column name and object
            for(int col = 1; col <= colCount; col ++){
                rowMap.put(resultSetMetaData1.getColumnName(col), resultSet.getObject(col));
            }
//                mapList.put(rowMap);
            mapList.add(rowMap);
        }
        //TODO create a for each loop
        for(Map<String, Object> map : mapList){
//            System.out.println(map);
            System.out.println(map.get("SALARY"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }



}
















