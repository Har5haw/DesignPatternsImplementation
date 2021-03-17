package Visitor;

public class VisitorImpl implements Visitor{
    @Override
    public double visitor(DivideTwo divideTwo) {
        return divideTwo.value/2;
    }

    @Override
    public double visitor(DivideTen divideTen) {
        return divideTen.value/10;
    }

    @Override
    public double visitor(DivideFive divideFive) {
        return divideFive.value/5;
    }
}
