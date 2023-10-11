package QueriesInJava;

import java.sql.*;

public class addingRecord {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // replace with your database URL
        String username = "your-username"; // replace with your username
        String password = "your-password"; // replace with your password
        
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            
            String sql = "INSERT INTO employees (id, name, age) VALUES (1, 'John Doe', 30)"; // replace with your table and column names
            int rows = stmt.executeUpdate(sql);
            
            System.out.println(rows + " row(s) added.");
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    

