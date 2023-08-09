package part20;

import java.util.ArrayList;

public class TwoDArrayList {
  public static void main(String[] args) {

    // 2D ArrayList = a dynamic list of lists, We can change the size of these lists
    // during runtime

    ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

    ArrayList<String> bakeryList = new ArrayList<String>();
    bakeryList.add("pasta");
    bakeryList.add("garlic bread");
    bakeryList.add("donuts");

    System.out.println(bakeryList);

    ArrayList<String> produceList = new ArrayList<String>();
    produceList.add("tomatoes");
    produceList.add("zucchini");
    produceList.add("peppers");

    System.out.println(produceList);

    ArrayList<String> drinksList = new ArrayList<String>();
    drinksList.add("soda");
    drinksList.add("coffee");

    System.out.println(drinksList);

    // the 2d arraylist is declared above, we need to add each arraylist into the 2d
    // arraylist
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinksList);

    // retrieve all the list in 2d ArrayList (groceryList)
    System.out.println("\nAll items list: ");
    System.out.println(groceryList);

    // retrieve the list of drinksList in the 2d ArrayList (groceryList)
    System.out.println("\nAll drinks list: ");
    System.out.println(groceryList.get(2));

    // retrieve only 1 element of bakeryList in the 2d ArrayList (groceryList)
    System.out.println("\nOnly 1 food I loved the most: ");
    System.out.println(groceryList.get(0).get(2));

  }
}