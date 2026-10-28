package patterns.decorator;

/**
 * Decorator that adds a sunroof and its cost to a car.
 */
public class Sunroof extends FeatureDecorator {

  public Sunroof(Car car) {
    super(car);
  }

  @Override
  public double getCost() {
    return 2000 + getDecoratedCar().getCost();
  }

  @Override
  public String getDescription() {
    return getDecoratedCar().getDescription() + ", includes sunroof";
  }
}
