package Database;



import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import util.ConfigReader;
import util.DBType;
import util.DBUtil;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UsingDBUtil {

    @BeforeClass
    public void setUP() throws SQLException {
        DBUtil.establishDBConnection(DBType.ORACLE);
    }

    @AfterClass
    public void closeConnections(){
        DBUtil.closeConnections();
    }


    // Query department name from departments
    @Test
    public void test1() throws SQLException {
        // select department_name fom departments
       List<Map<String, Object>> result =  DBUtil.runSQLQuery(ConfigReader.readProperty("query"));
       System.out.println(result);
        System.out.println(result.get(1));
    }

    // query first name and last name from employees table for those employees whos employee id = 105

    @Test
    public void test2() throws SQLException {

        // query first name and last name from employees table for those employees whos employee id = 105

        String query = "select first_name, last_name from employees where employee_id = 105";
        List<Map<String, Object>> result =  DBUtil.runSQLQuery(query);

        //Assert first_name = "David" last_name = "Austin"

        Assert.assertEquals(result.get(0).get("FIRST_NAME"), "David");
        Assert.assertEquals(result.get(0).get("LAST_NAME"), "Austin");

    }

    @Test
    public void test3() throws SQLException {
        //select country id from countries table where country id = BR
        String query = "select country_id from countries where country_id = 'BR'";
        List<Map<String, Object>> result =  DBUtil.runSQLQuery(query);

        //Assert country id = BR
        Assert.assertEquals(result.get(0).get("COUNTRY_ID"), "BR");

    }

}













