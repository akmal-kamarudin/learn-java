package part31;

public class ArrayOfObject {

  public static void main(String[] args) {

    // int[] numbers = new int[3];
    // char[] characters = new char[4];
    // String[] strings = new String[5];

    Food[] refrigerator = new Food[3];

    Food food1 = new Food("pizza");
    Food food2 = new Food("burger");
    Food food3 = new Food("hotdog");

    refrigerator[0] = food1;
    refrigerator[1] = food2;
    refrigerator[2] = food3;

    System.out.println(refrigerator[0].name);
    System.out.println(refrigerator[1].name);
    System.out.println(refrigerator[2].name);

    // Alternative way, declare the object with value
    Food food4 = new Food("Maggi");
    Food food5 = new Food("Lontong");
    Food food6 = new Food("Rojak");

    Food[] PetiAis = { food4, food5, food6 };

    System.out.println(PetiAis[0].name);
    System.out.println(PetiAis[1].name);
    System.out.println(PetiAis[2].name);
  }
}
