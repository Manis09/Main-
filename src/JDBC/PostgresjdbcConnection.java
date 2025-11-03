package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresjdbcConnection {
    public static void main(String[] args)  {
        String url="jdbc:postgresql://localhost:5432/postgres";

        String username="postgres";
        String password="manish";

        try {
            Class.forName("org.postgresql.Driver");

            Connection con= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to postgres");
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
