package part34;

public class Inheritance {
  public static void main(String[] args) {
    // inheritance = the process where one class acquires,
    // the attributes and methods of another.

    // in OOP, variables in class are attributes, and function in class are methods

    Car car1 = new Car();
    Bicycle bike = new Bicycle();

    car1.go();
    bike.stop();

    System.out.println(car1.speed);
    System.out.println(bike.speed);

    System.out.println(car1.wheels);
    System.out.println(bike.pedals);

  }
}
