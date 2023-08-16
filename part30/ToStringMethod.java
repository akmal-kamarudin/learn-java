package part30;

public class ToStringMethod {

  public static void main(String[] args) {

    // toString() = special method that all objects inherit,
    // that returns a string that "textually represents" an object.
    // can be used both implicitly and explicitly.

    Car car1 = new Car();

    System.out.println(car1.toString()); // explicitly
    System.out.println(car1); // implicitly

    System.out.println(car1.make);
    System.out.println(car1.model);
    System.out.println(car1.color);
    System.out.println(car1.year);

  }
}
