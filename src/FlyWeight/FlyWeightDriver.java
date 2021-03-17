package FlyWeight;

public class FlyWeightDriver {
    public static void main(String[] args) {
        Circle circle = (Circle) Factory.getCircle("red");
        circle.draw();

        circle = (Circle) Factory.getCircle("green");
        circle.draw();

        circle = (Circle) Factory.getCircle("black");
        circle.draw();

        circle = (Circle) Factory.getCircle("green");
        circle.draw();

        circle = (Circle) Factory.getCircle("black");
        circle.draw();
    }
}
