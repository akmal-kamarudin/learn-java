package part39;

public class Encapsulation {
  // Encapsulation = attributes of a class will be hidden or private,
  // Can be accessed only through methods (getters & setters)
  // You should make attributes private if you don't have a reason to make them
  // public/protected

  public static void main(String[] args) {
    Car car1 = new Car("Saga", "Proton", 2018);

    // setters, to manipulate the attributes
    car1.setYear(2022);

    // bcs the attributes(variable) are private, they are defined as a method
    // getters and return the variable
    System.out.println(car1.getMake());
    System.out.println(car1.getYear());
    System.out.println(car1.getModel());

    // does take effect but aren't shown
    car1.setModel("Bezza");

  }

}
