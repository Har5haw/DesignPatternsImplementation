package AbstractFactory;

public class Subtract implements Calculate{

    @Override
    public void calculate(double a, double b) {
        System.out.println(a-b);
    }
}
