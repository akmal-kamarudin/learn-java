package part16;

public class TwoDArrays {
  public static void main(String[] args) {
    // 2D array = an array of arrays

    String[][] cars = new String[3][3];

    cars[0][0] = "Camaro";
    cars[0][1] = "Corvette";
    cars[0][2] = "Silverado";
    cars[1][0] = "Mustang";
    cars[1][1] = "Ranger";
    cars[1][2] = "F1";
    cars[2][0] = "Ferrari";
    cars[2][1] = "Lambo";
    cars[2][2] = "Tesla";

    // another way to write 2d arrays
    String[][] fruits = {
        { "Camaro", "Corvette", "Silverado" },
        { "Mustang", "Ranger", "F1" },
        { "Ferrari", "Lambo", "Tesla" } };

    // use for loop to list arrays
    for (int i = 0; i < cars.length; i++) {
      System.out.println();
      for (int j = 0; j < cars.length; j++) {
        System.out.print(cars[i][j] + " ");
      }
    }

    for (int i = 0; i < fruits.length; i++) {
      System.out.println();
      for (int j = 0; j < fruits.length; j++) {
        System.out.print(fruits[i][j] + " ");
      }
    }

  }

}
