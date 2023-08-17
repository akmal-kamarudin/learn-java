package part37;

public class Abstraction {
  public static void main(String[] args) {
    // abstract = abstract classes cannot be instantiated, but they can have a
    // subclass

    // abstract methods are declared without an implementation

    // Vehicle vehicle1 = new Vehicle(); //cannot instantiate bcs its an abstract
    Car car1 = new Car();

    car1.go();
  }
}
