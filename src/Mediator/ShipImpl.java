package Mediator;

public class ShipImpl extends Ship{

    public ShipImpl(MediatorInterface mediatorInterface, String name){
        super(mediatorInterface, name);
    }

    @Override
    void send(String msg) {
        System.out.println("sending msg from ship "+name+" message is : "+msg);
        mediatorInterface.sendMsg(msg, this);
    }

    @Override
    void receive(String msg) {
        System.out.println("received msg for ship "+name+" message is : "+msg);
    }
}
