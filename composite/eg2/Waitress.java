package patterns.composite.eg2;

import java.util.List;
import java.util.Objects;

/**
 * Client that operates on a collection of menu components uniformly.
 */
public class Waitress {
  private final List<MenuComponent> allMenus;

  public Waitress(List<MenuComponent> allMenus) {
    this.allMenus = List.copyOf(Objects.requireNonNull(allMenus, "allMenus must not be null"));
  }

  public void printMenu() {
    for (MenuComponent menu : allMenus) {
      menu.print();
    }
  }

  /**
   * Prints all vegetarian items, including items nested in submenus.
   */
  public void printVegetarianMenu() {
    for (MenuComponent menu : allMenus) {
      printVegetarianItems(menu);
    }
  }

  private void printVegetarianItems(MenuComponent component) {
    List<MenuComponent> children = component.getChildren();
    if (children.isEmpty()) {
      if (component.isVegetarian()) {
        component.print();
      }
      return;
    }

    for (MenuComponent child : children) {
      printVegetarianItems(child);
    }
  }
}

