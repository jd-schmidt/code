import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jd on 5/12/15.
 */
public class JdbcInsert {

  public static void main(String[] args) {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    String query = "INSERT INTO employees(last_name, first_name, email, department, salary) values('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)";

    try {
      conn = DriverManager.getConnection(url, user, password);

      stmt = conn.createStatement();
      int rowsAffected = stmt.executeUpdate(query);

      rs = stmt.executeQuery("Select * from employees");

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
