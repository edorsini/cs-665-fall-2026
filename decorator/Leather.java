package patterns.decorator;

/**
 * Decorator that adds leather seats and their cost to a car.
 */
public class Leather extends FeatureDecorator {

  public Leather(Car car) {
    super(car);
  }

  @Override
  public double getCost() {
    return 3000 + getDecoratedCar().getCost();
  }

  @Override
  public String getDescription() {
    return getDecoratedCar().getDescription() + ", includes leather seats";
  }
}
