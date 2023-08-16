package part29;

public class Pizza {

  String bread;
  String sauce;
  String cheese;
  String topping;

  // This is a constructor (4 params)
  Pizza(String bread, String sauce, String cheese, String topping) {

    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
    this.topping = topping;
  }

  // This is a constructor (3 params)
  Pizza(String bread, String sauce, String cheese) {

    this.bread = bread;
    this.sauce = sauce;
    this.cheese = cheese;
  }

  // This is a constructor (2 params)
  Pizza(String bread, String sauce) {

    this.bread = bread;
    this.sauce = sauce;
  }

  // This is a constructor (1 params)
  Pizza(String bread) {

    this.bread = bread;
  }

}
