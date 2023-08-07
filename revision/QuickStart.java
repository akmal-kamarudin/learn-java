package revision;

import java.util.ArrayList;

class QuickStart {
  public static void main(String[] args) {

    String name = "sasalala";
    var nameUp = name.toUpperCase();
    var nameLow = name.toLowerCase();

    System.out.println("Hello, World.");
    System.out.println(name);
    System.out.println(nameUp);
    System.out.println(nameLow);

    // Calling the function below addSymbol
    String addFeat = addSymbol("HALO WORLDDDD, NICE to meet you");
    System.out.println(addFeat);

    Animal doggoAnimal = new Animal();
    String dog = doggoAnimal.iAmDog();
    System.out.println(dog);

    ArrayList<Integer> a = new ArrayList<Integer>();

    Animal stuff = new Animal();
    stuff.doStuff();
  }

  public static String addSymbol(String sss) {
    System.out.println(sss + " too fren");
    return (sss + "!");
  }
}