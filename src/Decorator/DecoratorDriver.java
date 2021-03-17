package Decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        BasicIceCream basicIceCream = new BasicIceCream();
        System.out.println(basicIceCream.cost());

        Chocolate chocolate = new Chocolate(basicIceCream);
        System.out.println(chocolate.cost());

        Mint mint = new Mint(chocolate);
        System.out.println(mint.cost());
    }
}
