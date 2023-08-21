package part44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
  public static void main(String[] args) {
    // exception = an event that occurs during the execution of a program that,
    // disrupts the normal flow of instructions

    // use try-catch block and finally, try is for handling the operation and catch
    // is for handling error exeption, and finally is for any used classses or
    // anything.

    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("Enter whole number to divide: ");
      int x = scanner.nextInt();

      System.out.println("Enter whole number to divide: ");
      int y = scanner.nextInt();

      int z = x / y;

      System.out.println("Result is " + z);

    } catch (ArithmeticException error) { // specific exception
      System.out.println("You can't divide by zero! IDIOT!");
      System.out.println(error);

    } catch (InputMismatchException e) { // specific exception
      System.out.println("Please enter a number omg!");
      System.out.println(e);

    } catch (Exception e) { // ALL exception
      System.out.println("This is absolutely an error.");
      System.out.println(e);

    } finally {
      scanner.close(); // we can use finally to close any open scanners.
      System.out.println("This will always print.");
    }

  }
}
