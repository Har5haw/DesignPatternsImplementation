package FlyWeight;

public class Circle implements Shape{

    String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("drawing circle with color:"+ color);
    }
}
