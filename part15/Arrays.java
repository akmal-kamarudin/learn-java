package part15;

public class Arrays {

  public static void main(String[] args) {
    // array = used to store multiple values in a single variable

    String[] cars = { "Camaro", "Corvete", "Tesla", "BMW" };

    cars[0] = "Mustang";

    System.out.println(cars[3]);

    // alternative ways to write arrays
    String[] fruits = new String[3];

    fruits[0] = "Apple";
    fruits[1] = "Orange";
    fruits[2] = "Durian";

    System.out.println(fruits[2]);

    // use loops to list arrays
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }

  }

}
