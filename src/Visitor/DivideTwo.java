package Visitor;

public class DivideTwo implements Visitable {

    double value;

    public DivideTwo(double value) {
        this.value = value;
    }

    @Override
    public double convert(Visitor visitor) {
        return visitor.visitor(this);
    }
}
