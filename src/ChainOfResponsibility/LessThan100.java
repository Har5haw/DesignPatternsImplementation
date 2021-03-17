package ChainOfResponsibility;

public class LessThan100 extends RangeDefiner{
    @Override
    protected int getRange() {
        return 100;
    }
}
