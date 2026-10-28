package patterns.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Concrete mediator that routes each driver's offer to the other registered drivers.
 */
public class Shop implements Mediator {

  private final Map<String, Driver> driverMap = new HashMap<>();

  @Override
  public void registerDriver(Driver d) {
    Driver driver = Objects.requireNonNull(d, "driver must not be null");
    Driver registeredDriver = driverMap.putIfAbsent(driver.getDriverName(), driver);
    if (registeredDriver != null && registeredDriver != driver) {
      throw new IllegalArgumentException("A driver named " + driver.getDriverName() + " is already registered");
    }
  }

  @Override
  public void unregisterDriver(Driver d) {
    Driver driver = Objects.requireNonNull(d, "driver must not be null");
    driverMap.remove(driver.getDriverName(), driver);
  }

  @Override
  public void notifyObservers(Driver driver, float offer) {
    Driver sender = Objects.requireNonNull(driver, "driver must not be null");
    if (!Float.isFinite(offer) || offer < 0) {
      throw new IllegalArgumentException("offer must be finite and non-negative");
    }

    Driver registeredSender = driverMap.get(sender.getDriverName());
    if (registeredSender != sender) {
      throw new IllegalArgumentException("Driver is not registered: " + sender.getDriverName());
    }

    System.out.printf("[Broadcast to all drivers] ---------->  NEW OFFER for: $%.2f%n", offer);
    for (Map.Entry<String, Driver> entry : driverMap.entrySet()) {
      if (entry.getValue() != sender) {
        entry.getValue().setLastOffer(offer);
      }
    }
  }
}
