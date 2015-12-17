import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * Created by jd on 6/3/15.
 */
public class RSMetaData {
  public static void main(String[] args) {

    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";
    String query = "SELECT id, last_name, first_name, salary FROM employees";
    try {
      // get a connection to database
      connection = DriverManager.getConnection(url, user, password);

      //run query
      stmt = connection.createStatement();
      rs = stmt.executeQuery(query);

      ResultSetMetaData rsmd = rs.getMetaData();

      int columnCount = rsmd.getColumnCount();

      System.out.println("Column count: " + columnCount + "\n\n");

      for (int i = 0 ; i < columnCount ; i++) {
        Boolean nullable = (rsmd.isNullable(i + 1) != 0);
        System.out.println("Column name: " + rsmd.getColumnName(i + 1));
        System.out.println("Column type name: " + rsmd.getColumnTypeName(i + 1));
        System.out.println("Is nullable? " + nullable);
        System.out.println("Is Auto Increment: " + rsmd.isAutoIncrement(i + 1));
        System.out.println();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
