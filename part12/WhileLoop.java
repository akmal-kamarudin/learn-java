package part12;

import java.util.Scanner;

public class WhileLoop {

  public static void main(String[] args) {
    // While loop = executes a block of code as long as it's condition remains true
    // Do-while loop = do first and then check conditions

    Scanner scanner = new Scanner(System.in);
    String name = "";

    do {
      System.out.println("Please type in your name");

      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    } while (name.isBlank());

    System.out.println("Hello " + name);

    scanner.close();
  }
}
