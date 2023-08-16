package part27;

public class Human {

  String name;
  int age;
  double weight;

  // This is a constructor
  Human(String name, int age, double weight) {

    this.name = name; // this = human1, human1.name
    this.age = age;
    this.weight = weight;
  }

  // This is a method
  void eat() {
    System.out.println(this.name + " is eating");
  }

  void drink() {
    System.out.println(this.name + " is drinking");
  }
}
