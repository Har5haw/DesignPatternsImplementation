package Visitor;

public class VisitorDriver {
    public static void main(String[] args) {
        Visitor visitor = new VisitorImpl();

        DivideTwo divideTwo = new DivideTwo(100);
        DivideFive divideFive = new DivideFive(100);
        DivideTen divideTen = new DivideTen(100);

        System.out.println(divideTwo.convert(visitor));
        System.out.println(divideFive.convert(visitor));
        System.out.println(divideTen.convert(visitor));
    }
}
