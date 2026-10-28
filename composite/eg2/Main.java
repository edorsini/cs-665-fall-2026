package patterns.composite.eg2;

import java.util.List;

/**
 * Demonstrates a tree of menus and menu-item leaves.
 */
public class Main {
  /**
   * Runs the Composite pattern menu demonstration.
   *
   * @param args command-line arguments (unused)
   */
  public static void main(String[] args) {

    MenuComponent lobsterRoll =
        new MenuItem("Lobster Roll", 24.99, false, "This is a popular choice..");

    MenuComponent vegetarianSalad = new MenuItem("Vegetarian Salad", 14.99, true, "Great choice..");
    Menu dinnerMenu = new Menu("Dinner Menu", "This menu includes the items after 6PM.");
    dinnerMenu.add(lobsterRoll);
    dinnerMenu.add(vegetarianSalad);


    MenuComponent americano =
        new MenuItem("Americano", 2.99, false, "This is a popular coffee choice..");
    MenuComponent chaiTea = new MenuItem("Chai Tea", 3.99, false, "This is a popular tea choice..");
    MenuComponent coffeeMenu =
        new Menu("Coffee Menu", "This menu includes the items all day for coffee and tea.");
    coffeeMenu.add(americano);
    coffeeMenu.add(chaiTea);

    List<MenuComponent> allMenus = List.of(dinnerMenu, coffeeMenu);

    Waitress myWaitress = new Waitress(allMenus);

    // Print the full tree. Use printVegetarianMenu() instead to show only vegetarian items.
    myWaitress.printMenu();
  }
}
