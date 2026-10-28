package patterns.decorator;

/**
 * Demonstrates adding car features by wrapping a car with decorators.
 */
public class Main {
  /**
   * Runs the Decorator pattern demonstration.
   *
   * @param args command-line arguments (unused)
   */
  public static void main(String[] args) {
    Car sportyCar = new HondaAccord();
    printCar(sportyCar);

    sportyCar = new Sunroof(sportyCar);
    printCar(sportyCar);

    sportyCar = new Leather(sportyCar);
    printCar(sportyCar);

    sportyCar = new Foglight(sportyCar);
    printCar(sportyCar);

    // The same decorators can be chained in one expression.
    Car chainedCar = new Foglight(new Leather(new Sunroof(new HondaAccord())));
    printCar(chainedCar);

    // Keep the previous layer so we can choose the car without the leather decorator.
    Car carWithSunroof = new Sunroof(new HondaAccord());
    Car carWithLeather = new Leather(carWithSunroof);
    printCar(carWithLeather);

    Car carWithoutLeather = carWithSunroof;
    printCar(carWithoutLeather);
  }

  private static void printCar(Car car) {
    System.out.println(car.getDescription() + ", $" + car.getCost());
  }
}
