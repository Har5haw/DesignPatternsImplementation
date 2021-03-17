package ChainOfResponsibility;

public class LessThan1000 extends RangeDefiner{
    @Override
    protected int getRange() {
        return 1000;
    }
}
