import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jd on 5/19/15.
 */
public class JdbcPreparedStmt {

  public static void main(String[] args) {

    Connection conn;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";

    String updateQuery = "SELECT * FROM employees WHERE salary > ? and department like ?";

    try {
      conn = DriverManager.getConnection(url, user, password);

      PreparedStatement preparedStatement = conn.prepareStatement(updateQuery);

      preparedStatement.setDouble(1, 80000);
      preparedStatement.setString(2, "Legal");

      rs = preparedStatement.executeQuery();

      while (rs.next()) {
        for (int i = 0 ; i < rs.getMetaData().getColumnCount() ; i++) {
          System.out.printf(rs.getObject(i + 1).toString() + "\t");
        }
        System.out.println();
      }

      System.out.println("\n");
      preparedStatement.setString(2, "" + "%");
      rs = preparedStatement.executeQuery();

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

    char msg[] = {78,111,119,32,72,105,114,105,110,103,0};

    for (int i = 0 ; i < msg.length ; i++) {
      System.out.printf(String.valueOf(msg[i]));
    }


  }
}
