package patterns.composite.eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Composite containing cars that can be printed as a group.
 */
public class MyCars implements Car {

  private final List<Car> childCars = new ArrayList<>();


  @Override
  public void print() {


    // enhanced for loop
    for (Car car : childCars) {
      car.print();
    }

//    for(int i=0; i < childCars.size(); i++) {
//      childCars.get(i).print();
//    }
  }

  public void add(Car vehicle) {
    childCars.add(Objects.requireNonNull(vehicle, "vehicle must not be null"));
  }

  public void remove(Car vehicle) {
    childCars.remove(vehicle);
  }

}
