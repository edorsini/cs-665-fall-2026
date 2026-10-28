package patterns.composite.eg2;

import java.util.List;

/**
 * Common type for menu composites and menu-item leaves.
 *
 * <p>Operations that do not apply to a particular component type throw
 * {@link UnsupportedOperationException}. Menus support child operations;
 * menu items support item properties.</p>
 */
public abstract class MenuComponent {

  /**
   * Adds a child to this menu.
   *
   * @throws UnsupportedOperationException if this component is not a menu
   */
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Cannot add a child to this component");
  }

  /**
   * Removes a child from this menu.
   *
   * @throws UnsupportedOperationException if this component is not a menu
   */
  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException("Cannot remove a child from this component");
  }

  /**
   * Returns a child by index.
   *
   * @throws UnsupportedOperationException if this component is not a menu
   */
  public MenuComponent getChild(int i) {
    throw new UnsupportedOperationException("This component has no indexed children");
  }

  /**
   * Returns this component's children. Leaves return an empty list.
   *
   * @return an immutable list of children
   */
  public List<MenuComponent> getChildren() {
    return List.of();
  }

  public String getName() {
    throw new UnsupportedOperationException("This component has no item name");
  }

  public String getDescription() {
    throw new UnsupportedOperationException("This component has no item description");
  }

  public double getPrice() {
    throw new UnsupportedOperationException("This component has no item price");
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException("This component has no dietary category");
  }

  public void print() {
    throw new UnsupportedOperationException("This component cannot be printed");
  }
}
