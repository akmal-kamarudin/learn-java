package part43;

import java.util.Scanner;

public class DynamicPolymorphism {
  public static void main(String[] args) {

    // polymorphism = many shapes/forms
    // dynamic= after compilation (during runtime)
    // ex: A Corvette is a: corvette, and a car, and a vehicle, and an object

    Scanner scanner = new Scanner(System.in);

    Animal animal1;

    System.out.println("What Animal you want?");
    System.out.print("(1=dog) or (2=cat): ");
    int choice = scanner.nextInt();

    if (choice == 1) {
      animal1 = new Dog();
      animal1.speak();
    } else if (choice == 2) {
      animal1 = new Cat();
      animal1.speak();
    } else {
      animal1 = new Animal();
      System.out.println("That choice was invalid butttt...");
      animal1.speak();
    }
  }
}
