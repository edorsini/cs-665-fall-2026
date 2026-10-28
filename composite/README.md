# Composite Pattern

The Composite pattern represents part-whole hierarchies as trees. Clients can
work with individual leaves and groups through a common component type, while
each group delegates operations to its children.

This repository has two small demonstrations:

## Car collection (`eg1`)

- `Car` is the shared component interface.
- `Honda`, `Ferrari`, and `Lambo` are leaves that print themselves.
- `MyCars` is a composite that stores `Car` children and prints each one.
- `Main` creates a collection, prints the whole group, and then prints one car
  directly.

This version focuses on uniform printing and simple grouping.

## Menu tree (`eg2`)

- `MenuComponent` is the common type for composite menus and leaf menu items.
- `Menu` stores child components and delegates printing to them; menus can
  contain other menus as well as items.
- `MenuItem` is a leaf with a name, price, description, and vegetarian flag.
- `Waitress` is a client that prints complete menus or recursively finds
  vegetarian items.

In the current demo, `Main` calls `printMenu()` to display the full menu tree.
It does not call `printVegetarianMenu()`; that method is an alternate client
operation and is exercised by `CompositeTest`. To see the filtered output in
the demo, call `myWaitress.printVegetarianMenu()` instead of
`myWaitress.printMenu()`.

Some operations only apply to one kind of component. For example, adding
children applies to `Menu`, while price and vegetarian status apply to
`MenuItem`; unsupported operations throw `UnsupportedOperationException`.
`Menu.getChildren()` returns a read-only snapshot, and the waitress copies its
root list so later caller changes do not alter its view.

## Run and test

Run `patterns.composite.eg1.Main` or `patterns.composite.eg2.Main` from the IDE.
The behavioral tests can be run with:

```sh
mvn -Dtest=CompositeTest test
```
