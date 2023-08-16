package part28;

public class VariableScope {
  public static void main(String[] args) {

    // local = declared inside a method
    // visible only to that method

    // global = declared outside a method, but within a class
    // visible to all parts of a class

    // Making a new object to be called
    Diceroller diceRoller = new Diceroller();
    LuckyDraw luckyDraw = new LuckyDraw();

  }
}