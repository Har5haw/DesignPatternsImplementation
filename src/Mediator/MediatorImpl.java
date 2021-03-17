package Mediator;

import java.util.ArrayList;

public class MediatorImpl implements MediatorInterface{

    private ArrayList<Ship> ships;

    public MediatorImpl() {
        this.ships = new ArrayList<>();
    }

    @Override
    public void sendMsg(String msg, Ship ship) {
        for(Ship s : ships){
            if(s != ship){
                s.receive(msg);
            }
        }
    }

    @Override
    public void addShip(Ship ship) {
        ships.add(ship);
    }
}
