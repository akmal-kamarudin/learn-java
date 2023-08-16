package part27;

public class Constructors {
  public static void main(String[] args) {

    // Constructor = special method that is called when an object is instantiated
    // (created)

    Human human1 = new Human("Rick", 65, 70);
    Human human2 = new Human("Morty", 16, 50);

    System.out.println(human1.name);
    System.out.println(human2.name);

    human2.eat();
    human1.drink();

    Car car1 = new Car("Saga", 2016, 3800.00);
    Car car2 = new Car("Bezza", 2023, 4400.00);

    System.out.println(car1.models);
    System.out.println(car1.years);

    car1.drive(human1.name);
    car2.drive(human2.name);

  }
}