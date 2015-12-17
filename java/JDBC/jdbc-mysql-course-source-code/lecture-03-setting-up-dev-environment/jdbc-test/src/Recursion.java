import java.util.Date;

public class Recursion {
  static StringBuilder b = new StringBuilder();
  public static void main(String[] args) {
//    System.out.println(myMethod(5));
//    b.delete(0, b.length());
//    System.out.println(myMethod(5));
//    long lon = System.currentTimeMillis();
//    Date date = new Date(lon);
//    System.out.println(date);
    System.out.println("Seems to print a single \\ for me");
  }

  static String myMethod( int counter)
  {

    if(counter == 0)
      return b.toString();
    else
    {
      System.out.println(counter);

      b.append(" F " + counter + " ");
      myMethod(--counter);
      return b.toString();
    }
  }
}
