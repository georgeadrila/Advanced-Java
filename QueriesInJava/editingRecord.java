package QueriesInJava;
import java.sql.*;

public class editingRecord {
    public static void main(String[] args) {
        try {
            // Establishing a connection to the Oracle database
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "username", "password");

            // Creating a statement object
            Statement stmt = conn.createStatement();

            // Updating a record in the database
            String sql = "UPDATE employees SET salary = 50000 WHERE employee_id = 100";
            int rowsAffected = stmt.executeUpdate(sql);

            // Checking if the update was successful
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("Record not found.");
            }

            // Closing the connection
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
