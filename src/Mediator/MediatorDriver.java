package Mediator;

public class MediatorDriver {
    public static void main(String[] args) {
        MediatorInterface mediatorInterface = new MediatorImpl();
        Ship ship1 = new ShipImpl(mediatorInterface, "harsha");
        Ship ship2 = new ShipImpl(mediatorInterface, "vardhan");
        Ship ship3 = new ShipImpl(mediatorInterface, "no_name");

        mediatorInterface.addShip(ship1);
        mediatorInterface.addShip(ship2);
        mediatorInterface.addShip(ship3);

        ship1.send("hai i am harsha");
    }
}
