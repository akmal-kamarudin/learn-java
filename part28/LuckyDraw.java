package part28;

import java.util.Random;

// This is local variable scope
public class LuckyDraw {

  // no global variables declacred

  LuckyDraw() {
    Random random = new Random();
    int number = 0;
    draw(random, number); // passing variables inside object to method

  }

  // the method receives variables from object
  void draw(Random random, int number) {
    number = random.nextInt(100) + 1;
    System.out.println("Your lucky number is " + number);
  }
}
