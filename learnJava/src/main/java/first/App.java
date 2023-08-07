package learnJava.src.main.java.first;

/**
 * Hello world!
 *
 */
public class App {

  // This is a comment
  /*
   * This
   * is a
   * multiline
   * comment
   */

  public static void main(String[] args) {
    System.out.println("Hello Akmal dan Wife :)");
    System.out.println("I love my wife \n");
    // print no new line, println = print new line

    System.out.println("\tMessage to wife: \" Hi Sayang \"");
    // use boiler-plate sysout = System.out.println();

    variable(args);
  }

  public static void variable(String[] args) {

    //
    int x; // declaration
    x = 1233453453; // assignment
    String y = "Hello"; // initialization
    long z = 1231231231231123133L;
    float w = 3.14f;
    double v = 3.13023;
    boolean u = true;
    char symbol = '?';

    System.out.println(x + y);
    System.out.println("My number is: " + x);
    System.out.println("My number is: " + z);
    System.out.println("My float is: " + w);
    System.out.println("My double is: " + v);
    System.out.println("It is " + u + symbol);

  }
}
