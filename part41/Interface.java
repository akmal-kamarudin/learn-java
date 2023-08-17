package part41;

public class Interface {

  public static void main(String[] args) {

    // interface = a template that can applied to a class. similar to inheritance,
    // but specifies what a class has/must do.
    // classes can apply more than one interface, inheritance is limited to 1 super.

    // unlike interface, inheritance uses keyword 'extends'

    Rabbit mrRabbit = new Rabbit();
    Hawk mrHawk = new Hawk();
    Fish mrFish = new Fish();

    mrRabbit.flee();
    mrHawk.hunt();
    mrFish.hunt();
    mrFish.flee();
  }
}
