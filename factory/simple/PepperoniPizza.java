package patterns.factory.simple;

public class PepperoniPizza implements Pizza {
    public void prepare() {
        System.out.println("preparing pepperoni pizza");
    }

    public void cook() {
        System.out.println("cooking pepperoni pizza");
    }
}
