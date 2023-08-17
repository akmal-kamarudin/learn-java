package part39;

public class Car {

  private String make;
  private String model;
  private int year;

  Car(String make, String model, int year) {
    // this.make = makes;
    // this.model = models;
    // this.year = years;

    // called the setters
    setMake(make);
    setModel(model);
    setYear(year);

  }

  // if want to retrive use getters
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  // if want to change use getters
  public void setMake(String makes) {
    this.make = makes;

  }

  public void setModel(String models) {
    this.model = models;
  }

  public void setYear(int years) {
    this.year = years;
  }

}
