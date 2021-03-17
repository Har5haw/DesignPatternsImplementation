package Decorator;

public class Mint extends IceCreamDecorator{

    public Mint(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        return 1 + super.cost();
    }
}
