package FlyWeight;

import java.util.HashMap;

public class Factory {
    private static HashMap maps = new HashMap();

    public static Shape getCircle(String color){
        if(maps.containsKey(color)){
            return (Circle)maps.get(color);
        }else{
            System.out.println("creating object ..");
            Circle circle = new Circle(color);
            maps.put(color, circle);
            return circle;
        }
    }
}
