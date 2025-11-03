package StudentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCHelper {
    public static final String DRIVER_NAME="org.postgresql.Driver";
    public static final String url="jdbc:postgresql://localhost:5432/studentdb";
    public static final String username="postgres";
    public static final String password="manish";
    public static Connection con=null;

    public static void getConnection(){


        try {
            //load the diver
            Class.forName(DRIVER_NAME);
            //Establish the connection
            con= DriverManager.getConnection(url,username,password);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (SQLException e) {
            System.out.println("Please check URL, USERNAME, PASSWORD");
        }
    }
    //Closing the connection
    public static void closeConnection(){
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println("Connection is not closed");
        }
    }
}
