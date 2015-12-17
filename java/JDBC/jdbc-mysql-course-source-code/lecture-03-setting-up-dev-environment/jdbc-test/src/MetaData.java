import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by jd on 5/28/15.
 */
public class MetaData {

  public static void main(String[] args) {

    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    try {
      // get a connection to database
      connection = DriverManager.getConnection(url, user, password);

      // Turn off auto commit
      connection.setAutoCommit(false);

      //show salaries before
//      System.out.println("++++++ Salaries Before ++++++");
//      QueryHelper.showSalaries(connection, "HR");
//      QueryHelper.showSalaries(connection, "Engineering");

      DatabaseMetaData meta = connection.getMetaData();

      System.out.println("Product name: " + meta.getDatabaseProductName());
      System.out.println("Product version: " + meta.getDatabaseProductVersion());
      System.out.println();

      System.out.println("JDBC Driver name: " + meta.getDriverName());
      System.out.println("JDBC Driver version: " + meta.getDriverVersion());
      System.out.println();

      System.out.println("Numeric functions: " + meta.getNumericFunctions());
      System.out.println("URL: " + meta.getURL());
      System.out.println();
      System.out.println("MaxUserNameLength: " + meta.getMaxUserNameLength());
      System.out.println("\n\n");
      ResultSet resultSet = meta.getColumns(null, null, "employees", null);



    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
