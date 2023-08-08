package first;

import java.util.Scanner;

import javax.swing.JOptionPane;

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

    // 2. Variables
    variable(args);

    // 3. Swap Variables
    swap(args);

    // 4. User input
    input(args);

    // 5. Expression
    expression(args);

    // 6. GUI Aapp
    gui(args);
  }

  public static void variable(String[] args) {

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

  public static void swap(String[] args) {
    String x = "water";

    String y = "Kool-Aid";
    String temp; // or =null

    temp = x;
    x = y;
    y = temp;

    System.out.println("x: " + x);
    System.out.println("y: " + y);

  }

  public static void input(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("How old are you? ");
    int age = scanner.nextInt();
    scanner.nextLine(); // clear input
    System.out.println("What is your fav food?");
    String food = scanner.nextLine();

    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old");
    System.out.println("You like to eat " + food);

    scanner.close();

  }

  public static void expression(String[] args) {

    // expression = operands & operators
    // operands = values, variables, numbers, quantity
    // operators = { + , - , * , / , %}

    int friends = 10;
    double apples = 20;

    friends = friends + 1;
    friends++;

    apples = (double) apples / 3;

    System.out.println(friends);
    System.out.println(apples);

  }

  public static void gui(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name:");
    JOptionPane.showMessageDialog(null, "Hello " + name);

    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
    JOptionPane.showMessageDialog(null, "You are " + age + " years old");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height:"));
    JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    ;

  }
}
