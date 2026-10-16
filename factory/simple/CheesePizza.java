package patterns.factory.simple;

public class CheesePizza implements Pizza {
    public void prepare() {
        System.out.println("preparing cheese pizza");
    }

    public void cook() {
        System.out.println("cooking cheese pizza");
    }
}
