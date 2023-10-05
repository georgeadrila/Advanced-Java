
// program to make connection to oracle database
import java.sql.*;

class connectToDb {
    public static void main(String args[]) {
        try {
            // load the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // create the connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orclpdb","scott","tiger");
            // create the statement
            Statement st = con.createStatement();
            // execute the query
            ResultSet rs = st.executeQuery("select * from emp");
            // process the result
            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
            // close the connection
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}