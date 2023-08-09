package part18;

public class WrapperClass {

  public static void main(String[] args) {

    // Wrapper Class = provides a way to use a primitive data types as reference
    // data types
    // reference data types contain useful methods can be used with collections
    // (ArrayList)

    // primitive //wrapper
    // --------- //-------
    // boolean Boolean
    // char Character
    // int Integer
    // double Double

    // autoboxing = the automatic conversion that the Java compiler makes between
    // the primitive types and their corresponding object wrapper classes
    // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class
    // to primitive

    // This is example of autoboxing, declaring a value to a wrapper class
    Boolean a = true;
    Character b = '$';
    Integer c = 123;
    Double d = 3.14;
    String e = "Bro";

    // This is example of unboxing, the wraper class still behave like a primitive
    // data type
    if (a == true) {
      System.out.println("This is true because 'a' is still a 'boolean primitive data type'");
    }

  }
}
