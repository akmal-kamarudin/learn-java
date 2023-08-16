package part28;

import java.util.Random;

// This is global variable scope
public class Diceroller {

  // Declare inside class, outside method/object
  Random random;
  int number;

  Diceroller() {
    random = new Random();
    roll(random, number); // still passed the varibles
  }

  // the method receives variables from class
  void roll(Random random, int number) {
    number = random.nextInt(6) + 1;
    System.out.println("Dice rolls to " + number);
  }
}

// This is Local Variable
// public class Diceroller {

// Diceroller() {
// Random random = new Random();
// int number = 0;
// roll(random, number);
// }

// void roll(Random random, int number) {
// number = random.nextInt(6) + 1;
// System.out.println(number);
// }
// }