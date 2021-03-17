package Memento;

import java.util.ArrayList;

public class Tracker {
    ArrayList<Memento> mementoArrayList;

    public Tracker() {
        this.mementoArrayList = new ArrayList<Memento>();
    }

    public void addMemento(Memento memento){
        mementoArrayList.add(memento);
    }

    public Memento getMemento(int index){
        return (Memento)mementoArrayList.get(index);
    }
}
