import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by jd on 6/3/15.
 */
public class BlobReader {

  public static void main(String[] args) {

    Connection connection = null;
    Statement stmt = null;
    ResultSet rs = null;
    FileOutputStream fileOutputStream;
    String url = "jdbc:mysql://localhost:3306/demo";
    String user = "jd";
    InputStream input;
    String password = "";


    try {
      // get a connection to database
      connection = DriverManager.getConnection(url, user, password);

      // Prepare statement
      String query = "SELECT resume from employees where email='john.doe@foo.com'";
      stmt = connection.createStatement();

      // Execute statement
      rs = stmt.executeQuery(query);

      // Set parameteres for resume file name
      File file = new File("output_resume.pdf");
      fileOutputStream = new FileOutputStream(file);


      // Read blob and store it in file
      if(rs.next()) {
        input = rs.getBinaryStream("resume");

        byte[] buffer = new byte[1024];
        while (input.read(buffer) > 0) {
          fileOutputStream.write(buffer);
        }
      }

      System.out.println("successful");

    } catch (Exception e) {
      System.out.println(System.getProperty("user.dir"));
      e.printStackTrace();
      e.getCause();
    }
  }
}
