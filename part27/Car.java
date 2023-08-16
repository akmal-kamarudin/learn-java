package part27;

public class Car {

  String models;
  int years;
  double prices;
  // String names;

  // This is a method
  void drive(String name) {
    // this.names = name;

    System.out.println(name + " is driving a " + models);
  }

  // This is a constructor
  Car(String model, int year, double price) {

    this.models = model;
    this.years = year;
    this.prices = price;

  }

}
