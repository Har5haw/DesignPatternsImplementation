package Visitor;

public class DivideFive implements Visitable{
    double value;

    public DivideFive(double value) {
        this.value = value;
    }

    @Override
    public double convert(Visitor visitor) {
        return visitor.visitor(this);
    }
}
