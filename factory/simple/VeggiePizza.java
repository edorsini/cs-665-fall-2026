package patterns.factory.simple;

public class VeggiePizza implements Pizza {
    public void prepare() {
        System.out.println("preparing veggie pizza");
    }

    public void cook() {
        System.out.println("cooking veggie pizza");
    }
}
