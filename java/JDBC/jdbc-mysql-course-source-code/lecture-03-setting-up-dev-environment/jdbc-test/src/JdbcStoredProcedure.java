import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

/**
 * Created by jd on 5/26/15.
 */
public class JdbcStoredProcedure {

  public static void main(String[] args) {

    Connection connection = null;
    CallableStatement callableStatement = null;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    try {
      // get a connection to database
      connection = DriverManager.getConnection(url, user, password);

      String department = "Engineering";

      System.out.println("Salaries Before");
      QueryHelper.showSalaries(connection, department);

      callableStatement = connection.prepareCall("{call get_employees_for_department(?,?)}");

      callableStatement.registerOutParameter(1, Types.INTEGER);
      callableStatement.setString(1, department);

      System.out.println("Calling stored procedure");
      callableStatement.execute();
      System.out.println("Done calling procedure\n\n");

//      QueryHelper.showSalaries(connection, department);

      System.out.println("\nThe count: " + callableStatement.getInt(2));


    } catch (Exception e) {
      e.printStackTrace();
    }
  }

//  private static void showSalaries(Connection connection, String department) throws Exception{
//    ResultSet rs = connection.createStatement().executeQuery("SELECT * FROM employees WHERE department='" + department + '\'');
//
//    while (rs.next()) {
//      for (int i = 0 ; i < rs.getMetaData().getColumnCount() ; i++) {
//        System.out.printf(rs.getObject(i + 1).toString() + "\t");
//      }
//      System.out.println();
//    }
//  }
}
