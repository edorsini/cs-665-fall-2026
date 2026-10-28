package patterns.decorator;

import java.util.Objects;

/**
 * Base decorator that wraps another car and preserves the {@link Car} interface.
 */
public abstract class FeatureDecorator extends Car {
  private final Car car; // HAS-A relationship

  protected FeatureDecorator(Car car) {
    this.car = Objects.requireNonNull(car, "car must not be null");
  }

  /**
   * Returns the wrapped car for a concrete decorator to extend.
   *
   * @return wrapped car
   */
  protected final Car getDecoratedCar() {
    return this.car;
  }

  @Override
  public String getDescription() {
    return this.car.getDescription();
  }

  @Override
  public double getCost() {
    return this.car.getCost();
  }
}
