package patterns.decorator;

/**
 * Component type shared by a base car and its feature decorators.
 */
public abstract class Car {

  private final String description;

  protected Car() {
    this("car");
  }

  protected Car(String description) {
    this.description = description;
  }

  /**
   * Returns the description of this car and any added features.
   *
   * @return car description
   */
  public String getDescription() {
    return this.description;
  }

  /**
   * Returns the total cost of this car and any added features.
   *
   * @return total cost
   */
  public abstract double getCost();
}
