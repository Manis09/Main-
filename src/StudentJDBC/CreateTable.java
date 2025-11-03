package StudentJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        JDBCHelper.getConnection();
        Connection connection=JDBCHelper.con;
        if(connection != null){
            System.out.println("Connection established");

            String createTableQuery ="CREATE TABLE STUDENT(STUDENT_ID SERIAL PRIMARY KEY,STUDENT_NAME VARCHAR(50)," +
                    "ADDRESS VARCHAR(50),PHONE_NO VARCHAR(15))";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTableQuery);
                System.out.println("Student table has created");

            } catch (SQLException e) {
                System.out.println("Error creating a table");
                e.printStackTrace();
            }
            finally {
                JDBCHelper.closeConnection();
                System.out.println("Connection is closed");
            }
        }else{
            System.out.println("Connection not established");
        }
    }
}
