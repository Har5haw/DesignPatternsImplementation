package Visitor;

public class DivideTen implements Visitable{
    double value;

    public DivideTen(double value) {
        this.value = value;
    }

    @Override
    public double convert(Visitor visitor) {
        return visitor.visitor(this);
    }
}
