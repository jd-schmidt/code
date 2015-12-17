import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jd on 5/19/15.
 */
public class JdbcDelete {

  public static void main(String[] args) {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    String updateQuery = "DELETE FROM employees WHERE first_name = 'BOB'";

    try {
      // get a connection to database
      conn = DriverManager.getConnection(url, user, password);

      // create a statement
      stmt = conn.createStatement();
      int rowsAffected = stmt.executeUpdate(updateQuery);
      System.out.println("Rows affect: " + rowsAffected);

      rs = stmt.executeQuery("SELECT * from employees");

      while (rs.next()) {
        for (int i = 0 ; i < rs.getMetaData().getColumnCount() ; i++) {
          System.out.printf(rs.getObject(i + 1).toString() + "\t");
        }
        System.out.println();
      }

    } catch (SQLException sqlex) {
      System.out.println("Error connecting to DB");
      sqlex.printStackTrace();
    }


  }
}
