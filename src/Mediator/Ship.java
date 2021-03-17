package Mediator;

public abstract class Ship {
    MediatorInterface mediatorInterface;
    String name;

    public Ship(MediatorInterface mediatorInterface, String name) {
        this.mediatorInterface = mediatorInterface;
        this.name = name;
    }

    abstract void send(String msg);
    abstract void receive(String msg);
}
