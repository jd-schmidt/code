import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import java.nio.charset.Charset;

/**
 * Created by jd on 8/18/15.
 */
public class InstanceOfTest {



  public static void main(String[] args) {
    int myInt = 9;
    String myString = "What";
    System.out.println(myString instanceof String );
//    System.out.println(myInt instanceof long);

    final String defaultCharset = Charset.defaultCharset().displayName();

    System.out.println("Default character set is " + defaultCharset + " instead of UTF-8");

  }
}
