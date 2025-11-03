package StudentJDBC;

import java.sql.Connection;
import java.util.Scanner;

public class UpdateTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JDBCHelper.getConnection();
        Connection con=JDBCHelper.con;
        if(con != null){
            System.out.println("Connection established");

        }
    }
}
