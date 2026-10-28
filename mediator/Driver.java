package patterns.mediator;

import java.util.Objects;

/**
 * Colleague that submits offers through a mediator and stores received offers.
 */
public class Driver {

  private final String driverName;
  private float lastOffer;

  public Driver(String name) {
    this.driverName = Objects.requireNonNull(name, "name must not be null");
    if (name.isBlank()) {
      throw new IllegalArgumentException("name must not be blank");
    }
  }

  public String getDriverName() {
    return driverName;
  }

  /**
   * Submits an offer to the mediator for distribution to other drivers.
   *
   * @param mediator mediator responsible for routing the offer
   * @param offer offer amount
   */
  public void setMyOffer(Mediator mediator, float offer) {
    Mediator offerMediator = Objects.requireNonNull(mediator, "mediator must not be null");
    if (!Float.isFinite(offer) || offer < 0) {
      throw new IllegalArgumentException("offer must be finite and non-negative");
    }

    System.out.printf("Current offer is: $%.2f  " +
        this.driverName + "'s new offer is: $%.2f \n", this.getLastOffer(), offer);

    offerMediator.notifyObservers(this, offer);
  }

  public float getLastOffer() {
    return this.lastOffer;
  }

  void setLastOffer(float lastOffer) {
    this.lastOffer = lastOffer;
  }
}