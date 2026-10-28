package patterns.decorator;

/**
 * Decorator that adds foglights and their cost to a car.
 */
public class Foglight extends FeatureDecorator {

  // Extends Car through FeatureDecorator and wraps another Car (IS-A and HAS-A).
  public Foglight(Car car) {
    super(car);
  }

  @Override
  public double getCost() {
    return 1500 + getDecoratedCar().getCost();
  }

  @Override
  public String getDescription() {
    return getDecoratedCar().getDescription() + ", includes foglights";
  }
}
