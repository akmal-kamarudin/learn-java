package part29;

public class OverloadConstructors {

  // overloaded constructors = multiple constructors within a class with the same
  // name, but have different parameters name + parameters = signature

  public static void main(String[] args) {

    Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozarella", "peperoni");

    System.out.println("Here are the ingredient of your pizza");
    System.out.println(pizza1.bread);
    System.out.println(pizza1.sauce);
    System.out.println(pizza1.cheese);
    System.out.println(pizza1.topping);

    Pizza pizza2 = new Pizza("thicc crust", "tomato", "mozarella");

    System.out.println("Here are the ingredient of your pizza");
    System.out.println(pizza2.bread);
    System.out.println(pizza2.sauce);
    System.out.println(pizza2.cheese);

    Pizza pizza3 = new Pizza("thicc crust", "tomato");

    System.out.println("Here are the ingredient of your pizza");
    System.out.println(pizza3.bread);
    System.out.println(pizza3.sauce);

    Pizza pizza4 = new Pizza("thicc crust");

    System.out.println("Here are the ingredient of your pizza");
    System.out.println(pizza4.bread);

  }
}
