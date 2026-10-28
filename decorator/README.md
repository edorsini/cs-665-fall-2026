# Decorator Pattern

The Decorator pattern adds optional behavior to an object by wrapping it in
another object that implements the same component type. Decorators can be
stacked, so each wrapper adds to the behavior of the wrapped object without
requiring a separate subclass for every feature combination.

## Roles in this example

- **Component — `Car`:** common type exposing `getDescription()` and
  `getCost()`.
- **Concrete component — `HondaAccord`:** base car with the initial description
  and cost.
- **Decorator base — `FeatureDecorator`:** is a `Car` and wraps another `Car`,
  delegating the component operations by default.
- **Concrete decorators — `Sunroof`, `Leather`, and `Foglight`:** wrap a car,
  append a feature to its description, and add that feature's cost.
- **Client — `Main`:** adds features by repeatedly wrapping the current `Car`.

## How the example works

1. `Main` creates a `HondaAccord` and uses it through the `Car` type.
2. `new Sunroof(car)` returns another `Car` that includes the wrapped car and
   the sunroof.
3. Further decorators can wrap that result. Calling `getDescription()` or
   `getCost()` delegates through the wrappers, accumulating each feature.

Decorators do not have a built-in removal operation. In `Main`, the removal
example keeps a reference to the car before adding leather, then selects that
earlier reference to show the car without the leather feature. If only the
outermost decorated object is retained, removing an inner decorator requires
rebuilding the desired wrapper chain or adding an explicit unwrapping API.

The example's prices are illustrative. Decorators require a non-null wrapped
car, and the order of wrappers determines the order in which features appear in
the description.

## Run and test

Run `patterns.decorator.Main` from the IDE to see the car's description and
price grow as features are added. Run the focused behavior tests with:

```sh
mvn -Dtest=DecoratorTest test
```
