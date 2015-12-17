import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 * Created by jd on 6/3/15.
 */
public class Blobs {

  public static void main(String[] args) {

    Connection connection = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    FileInputStream input;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    String password = "";


    try {
      // get a connection to database
      connection = DriverManager.getConnection(url, user, password);

      // Prepare statement
      String query = "UPDATE employees SET resume=? WHERE email = 'john.doe@foo.com'";
      stmt = connection.prepareStatement(query);

      // Set parameteres for resume file name
      File file = new File("sample_resume.pdf");
      input = new FileInputStream(file);
      stmt.setBinaryStream(1, input);

      System.out.println("Reading input file: " + file.getAbsolutePath());

      // Execute statement
      System.out.println("\nStoring resume in database: " + file);
      System.out.println(query);

      stmt.execute();

      System.out.println("successful");

    } catch (Exception e) {
      System.out.println(System.getProperty("user.dir"));
      e.printStackTrace();
    }
  }
}
