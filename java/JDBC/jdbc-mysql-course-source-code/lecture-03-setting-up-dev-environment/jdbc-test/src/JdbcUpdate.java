import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jd on 5/19/15.
 */
public class JdbcUpdate {

  public static void main(String[] args) {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    String updateQuery = "UPDATE employees SET email='john.doe@luv2code.com' WHERE last_name='Doe' and first_name='John'";

    try {
      conn = DriverManager.getConnection(url, user, password);

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
