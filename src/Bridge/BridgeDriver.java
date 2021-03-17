package Bridge;

public class BridgeDriver {
    public static void main(String[] args) {
        WorkShop assemble = new Assemble();
        WorkShop make = new Make();

        Vehicle car = new Car(make, assemble);
        Vehicle bike = new Bike(make, assemble);

        car.manufacture();
        bike.manufacture();
    }
}
