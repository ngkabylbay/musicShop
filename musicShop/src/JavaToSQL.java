import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JavaToSQL {
    // JDBC URL, username and password of MySQL server
    public final static String url="jdbc:postgresql://localhost:5432/musicShop";
    public final static String user="postgres";
    public final static String pass="root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    public static void main(String[] args) {
        String query = "select count(*) from product.instrument";
        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, pass);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int count = rs.getInt(  1);
                System.out.println("Total number of instruments : " + count);
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultSet here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
    }



}
