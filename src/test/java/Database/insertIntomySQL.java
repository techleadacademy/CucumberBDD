package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertIntomySQL {

    public static void main (String ... args){
        insertToDB();
    }

    public static void insertToDB(){
        try{
            String myURL = "jdbc:mysql://db4free.net:3306/techleadacademy";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myURL,"techlead","students");

            //                                         1       2      3     4
            String postQuery = "INSERT INTO students (name,lastname,team,student_id) VALUE (?,?,?,?)";

            // PrepareStatement is sql interface, allows us to post into Database tables
            PreparedStatement preparedStatement = conn.prepareStatement(postQuery);
            preparedStatement.setString(1,"Arnold");
            preparedStatement.setString(2, "Travolta");
            preparedStatement.setString(3, "champions");
            preparedStatement.setInt(4, 1004);

            preparedStatement.execute();
            conn.close();
        }catch (Exception e){
            System.out.println("Got an exception!");
            System.out.println(e.getMessage());
        }
    }
}









