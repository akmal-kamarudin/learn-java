package part8;

import java.util.Random;

// Generate random numbers for int, double and boolean
public class RandomNum {
  public static void main(String[] args) {

    Random random = new Random();

    int x = random.nextInt(6) + 1;
    double y = random.nextDouble();
    boolean z = random.nextBoolean();

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);

  }
}
