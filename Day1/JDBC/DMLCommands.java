import java.util.*;
import java.sql.*;

public class DMLCommands {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        int c = Integer.parseInt(sc.nextLine());
        String url = "jdbc:mysql://localhost:3306/student";
        try {
            // Connecting with Database
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "root");
            // Statement
            Statement stmt = conn.createStatement();
            int rs = stmt.executeUpdate("insert into record values(" + a + ",'" + b + "'," + c + ");");
            System.out.println("Inserted into table");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}