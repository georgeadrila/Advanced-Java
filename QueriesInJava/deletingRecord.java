// delete a record from the table
package QueriesInJava;
import java.sql.*;
class deletingRecord
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
            Statement stmt=con.createStatement();
            int i=stmt.executeUpdate("delete from emp where id=1");
            System.out.println(i+" record deleted");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
