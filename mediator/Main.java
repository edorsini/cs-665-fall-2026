package patterns.mediator;

/**
 * Demonstrates drivers communicating through a shop mediator.
 */
public class Main {

  /**
   * Runs the Mediator pattern demonstration.
   *
   * @param args command-line arguments (unused)
   */
  public static void main(String[] args) {

    Driver tesla = new Driver("Michael");
    Driver ferrari = new Driver("Maria");

    Shop grubHub = new Shop();  // <-- our concrete Mediator

    // Register the two drivers to drive for GrubHub
    grubHub.registerDriver(tesla);
    grubHub.registerDriver(ferrari);

    // Now, drivers can start sending their offers.
    tesla.setMyOffer(grubHub, 45);
    ferrari.setMyOffer(grubHub, 40);
    tesla.setMyOffer(grubHub, 35);
    ferrari.setMyOffer(grubHub, 30);

  }

}
