# Mediator Pattern

The Mediator pattern centralizes communication between related objects. Rather
than having colleagues communicate directly with one another, each colleague
sends information to the mediator, which coordinates how it is shared.

## Roles in this example

- **Mediator — `Mediator`:** defines driver registration and offer-routing
  operations.
- **Concrete mediator — `Shop`:** keeps track of registered drivers and routes
  an offer to every other registered driver.
- **Colleagues — `Driver` instances:** submit offers through the shop and store
  offers received from other drivers.
- **Client — `Main`:** creates the drivers and shop, registers the drivers, and
  initiates offers.

## How the example works

1. `Main` registers each driver with the shop.
2. A driver submits an offer through `setMyOffer(shop, amount)`.
3. The shop validates that the exact sender object is registered and updates
   the last offer for each of the other registered drivers.
4. The sender does not receive its own offer as a received offer.

The drivers do not need references to one another; the shop mediates their
communication. This example tracks only the most recent offer received by each
driver. It is a simplified coordination demo, not a full delivery marketplace.

## Run and test

Run `patterns.mediator.Main` from the IDE to see drivers submit offers through
the shop. Run the focused behavior tests with:

```sh
mvn -Dtest=MediatorTest test
```
