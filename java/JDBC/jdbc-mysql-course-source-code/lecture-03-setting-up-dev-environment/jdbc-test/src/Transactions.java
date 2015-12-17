import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Transactions {

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
      System.out.println("++++++ Salaries Before ++++++");
      QueryHelper.showSalaries(connection, "HR");
      QueryHelper.showSalaries(connection, "Engineering");

      // Tx 1
      stmt = connection.createStatement();
      stmt.executeUpdate("DELETE FROM employees WHERE department='HR'");

      // Tx 2
      stmt.executeUpdate("UPDATE employees SET salary=300000 WHERE department='Engineering'");

      System.out.println("\n>> tx steps are ready\n");

//      QueryHelper.showSalaries(connection, department);

//      System.out.println("\nThe count: " + callableStatement.getInt(2));

      boolean commit = QueryHelper.askUserIfOkToSave();
      if (commit) {
        connection.commit();
        System.out.println("Commit executed");
      } else {
        connection.rollback();
        System.out.println("Rollback executed");
      }

      //show salaries after
      System.out.println("++++++ Salaries After ++++++");
      QueryHelper.showSalaries(connection, "HR");
      QueryHelper.showSalaries(connection, "Engineering");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
