package part35;

public class MethodOveride {
  public static void main(String[] args) {
    // method overriding = Declaring a method in sub class,
    // which is already present in parent class.
    // done so that a child class can give its own

    Animal animalz = new Animal();
    Dog doggo = new Dog();

    animalz.speak();
    doggo.speak();
  }
}
