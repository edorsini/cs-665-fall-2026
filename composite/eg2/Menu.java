package patterns.composite.eg2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Composite component that groups menu items and nested menus.
 */
public class Menu extends MenuComponent {

  private final List<MenuComponent> menuComponents = new ArrayList<>();

  private final String name;
  private final String description;

  public Menu(String name, String description) {
    this.name = Objects.requireNonNull(name, "name must not be null");
    this.description = Objects.requireNonNull(description, "description must not be null");
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(Objects.requireNonNull(menuComponent, "menuComponent must not be null"));
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public boolean isVegetarian() {
    return false;
  }

  @Override
  public List<MenuComponent> getChildren() {
    return Collections.unmodifiableList(new ArrayList<>(this.menuComponents));
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  /**
   * Returns the number of direct children of this menu.
   */
  public int getSize() {
    return this.menuComponents.size();
  }

  @Override
  public void print() {
    System.out.print("\n" + this.getName());
    System.out.println(", " + this.getDescription());
    Iterator<MenuComponent> iterator = this.menuComponents.iterator();
    while (iterator.hasNext()) {
      MenuComponent menuComponent = iterator.next();
      menuComponent.print();
    }
  }
}
