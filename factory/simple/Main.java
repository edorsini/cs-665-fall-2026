package patterns.factory.simple;

// Design principles:
// Open Closed principle: classes, methods, or functions should be Open for extension and closed for modification.
//   The key benefit of this design principle is that already tried and tested code is not touched which means they
//   won’t break.


public class Main {
    // Solution
    SimplePizzaFactory factory = new SimplePizzaFactory();

    public static void main(String[] args) {

        // Problem:
//        System.out.println("without pattern");
//        System.out.println("--------------------------");
//        Pizza myPizza = orderPizza("cheese");
//        System.out.println(myPizza + "\n");

        // Solution:
        System.out.println("with Simple Factory pattern");
        System.out.println("--------------------------");
        Main store = new Main();
        Pizza myPizzza = store.orderPizzza("cheese");
        System.out.println(myPizzza);


    }

    // Problem:
//    public static Pizza orderPizza(String type) {
//        Pizza pizza = null;
//
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }
//
//        pizza.prepare();
//        pizza.cook();
//
//        return pizza;
//    }

    // Solution:
    public Pizza orderPizzza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.cook();

        return pizza;

    }
}
