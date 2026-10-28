package patterns.composite.eg2;

import java.util.Objects;

/**
 * Leaf component representing a single menu item.
 */
public class MenuItem extends MenuComponent {
  private final String name;
  private final String description;
  private final boolean vegetarian;
  private final double price;

  public MenuItem(String name, double price, boolean vegetarian, String description) {
    this.name = Objects.requireNonNull(name, "name must not be null");
    this.description = Objects.requireNonNull(description, "description must not be null");
    if (!Double.isFinite(price) || price < 0) {
      throw new IllegalArgumentException("price must be finite and non-negative");
    }
    this.price = price;
    this.vegetarian = vegetarian;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public double getPrice() {
    return price;
  }

  @Override
  public boolean isVegetarian() {
    return this.vegetarian;
  }

  @Override
  public void print() {
    System.out.println(this.name + (this.vegetarian ? " (v)" : "")
        + ", $" + this.price + " -- " + this.description);
  }
}
