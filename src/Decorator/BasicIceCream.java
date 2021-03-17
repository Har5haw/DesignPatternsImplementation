package Decorator;

public class BasicIceCream implements IceCream{

    public BasicIceCream() {
        System.out.println("Basic ice cream created..");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
