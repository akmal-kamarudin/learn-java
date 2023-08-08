package part11;

import java.util.Scanner;

public class Logics {
  public static void main(String[] args) {
    // && = (AND) both conditions must be true
    // || = (OR) either conditions must be true
    // ! = (NOT) reverse boolean value of condition

    // && example
    int temp = 25;

    if (temp > 30) {
      System.out.println("It is hot outside");
    } else if (temp >= 20 && temp <= 30) {
      System.out.println("It is warm outside");
    } else {
      System.out.println("It is cold outside");
    }

    // || example
    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit.");
    String response = scanner.next();

    if (response.equals("q") || response.equals("Q")) {
      System.out.println("You quit the game");
    } else {
      System.out.println("You are still playing the game!");
    }

    // ! example
    System.out.println("You are playing a game! Press q or Q to quit.");
    String ans = scanner.next();

    if (!ans.equals("q") && !ans.equals("Q")) {
      System.out.println("You are still playing the game!");
    } else {
      System.out.println("You quit the game");
    }

    scanner.close();
  }

}
