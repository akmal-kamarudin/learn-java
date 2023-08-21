package part42;

public class Polymorphism {
  public static void main(String[] args) {
    // polymorphism = greek word for poly-"many", morph-"form"
    // The ability of an object to identify as more than one type

    Car car1 = new Car();
    Bicycle bicycle1 = new Bicycle();
    Boat boat1 = new Boat();

    // Vehicle can be replaced with Object data type, as cars, bicycle and boats are
    // objects
    Vehicle[] racers = { car1, bicycle1, boat1 };

    // car1.go();
    // bicycle1.go();
    // boat1.go();

    for (Vehicle x : racers) {
      x.go();
    }
  }
}
