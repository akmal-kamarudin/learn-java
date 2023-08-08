package part13;

public class ForLoop {
  public static void main(String[] args) {
    // For loop = executes a block of code a limited amount of times

    for (int i = 10; i >= 0; i--) {
      System.out.println(i);
    }

    System.out.println("Happy new Year!!");

    for (int j = 10; j >= 0; j -= 2) {
      System.out.println(j);
    }

    // optional way
    for (int j = 10; j >= 0;) {
      System.out.println(j);
      j -= 2;
    }
  }
}
