package patterns.mediator;

/**
 * Defines how drivers register with a shop and share offers through it.
 */
public interface Mediator {

  /**
   * Registers a driver with the mediator.
   *
   * @param driver driver to register
   */
  void registerDriver(Driver driver);

  /**
   * Unregisters a previously registered driver.
   *
   * @param driver driver to unregister
   */
  void unregisterDriver(Driver driver);

  /**
   * Shares an offer from a registered driver with the other registered drivers.
   *
   * @param driverName name of the driver making the offer
   * @param offer new offer
   */
  void notifyObservers(Driver driver, float offer);
}
