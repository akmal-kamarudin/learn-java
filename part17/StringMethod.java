package part17;

public class StringMethod {

  public static void main(String[] args) {

    // String = a reference data type that can store one or more characters
    // reference data types have access to usefull methods

    String name = "Bro";

    boolean result = name.equalsIgnoreCase("bro"); // check if the string is the same or not (equals OR
                                                   // equalsIgnoreCase)
    int result2 = name.length(); // return the value of elements in the string
    char result3 = name.charAt(1); // checks the char in string based on the index
    int result4 = name.indexOf("B"); // checks the index of the char in string
    boolean result5 = name.isEmpty(); // checks empty or not
    String result6 = name.toUpperCase(); // ALL upper case
    String result7 = name.toLowerCase(); // ALL lower case
    String result8 = name.trim(); // remove any empty space in the string
    String result9 = name.replace('r', 'o');

    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    System.out.println(result7);
    System.out.println(result8);
    System.out.println(result9);

  }
}
