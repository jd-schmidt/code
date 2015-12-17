

import java.sql.*;

/**
 * 
 * @author www.luv2code.com
 *
 */
public class JdbcTest {

	public static void main(String[] args) throws SQLException {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
                String userName = "jd";
                String password = "";

		
		try {
                  // 1. Get a connection to database
                  myConn =
                      DriverManager
                          .getConnection("jdbc:mysql://localhost:3306/demo", userName, password);

                  System.out.println("Database connection successful!\n");

                  // 2. Create a statement
                  myStmt = myConn.createStatement();

                  // 3. Execute SQL query
                  myRs = myStmt.executeQuery("select * from employees");

                  // I like headers
                  System.out.println("last_name, first_name");
                  System.out.println(new String(new char[21]).replace('\0', '+'));

                  // 4. Process the result set
                  while (myRs.next()) {
                    System.out
                        .println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
                  }
                }
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
