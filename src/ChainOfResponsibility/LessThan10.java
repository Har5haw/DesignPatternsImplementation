package ChainOfResponsibility;

public class LessThan10 extends RangeDefiner{
    @Override
    protected int getRange() {
        return 10;
    }
}
