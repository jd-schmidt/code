import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by jd on 5/26/15.
 */
public class QueryHelper {

  public static void showSalaries(Connection connection, String department) throws SQLException{
    ResultSet
        rs = connection.createStatement().executeQuery("SELECT * FROM employees WHERE department='" + department + '\'');

    while (rs.next()) {
      for (int i = 0 ; i < rs.getMetaData().getColumnCount() ; i++) {
        System.out.printf(rs.getObject(i + 1).toString() + "\t");
      }
      System.out.println();
    }
  }

  public static void display(ResultSet rs) throws SQLException {
    if (rs == null) {
      throw new RuntimeException("No result set found");
    }
    int columns = rs.getMetaData().getColumnCount();
    while(rs.next()) {
      for (int i = 0 ; i < columns ; i++) {
        System.out.printf(rs.getObject(i + 1).toString() + "\t");
      }
      System.out.println();
    }
  }

  public static boolean askUserIfOkToSave() {
    System.out.println("Is it ok to save these changes? (True/False)");
    Scanner scanner = new Scanner(System.in);
    Boolean ret = scanner.nextBoolean();
    return ret;
  }
}
