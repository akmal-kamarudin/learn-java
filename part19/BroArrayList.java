package part19;

import java.util.ArrayList;

public class BroArrayList {

  public static void main(String[] args) {

    // ArrayList = a resizable array.
    // Elements can be added and removed after compilation phase
    // store reference data types

    ArrayList<String> food = new ArrayList<String>();
    // ArrayList<Integer> numbers = new ArrayList<Integer>();

    // ArrayList methods
    food.add("pizza");
    food.add("hamburger");
    food.add("hotdog");
    food.add("pasta");

    food.set(0, "sushi"); // replace string element "pizza" to "sushi"
    food.remove(2); // delete element "hotdog" from array
    // food.clear(); // clear ALL from array
    // food.size(); // returns the length of array
    // food.get(i); // returns the element of array according to the index

    for (int i = 0; i < food.size(); i++) {
      System.out.println(food.get(i));
    }
  }
}