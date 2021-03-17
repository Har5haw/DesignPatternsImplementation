package Memento;

public class MementoDriver {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Original original = new Original("shaw");
        Memento memento = original.createMemento();
        tracker.addMemento(memento);
        System.out.println(original.getState());

        original.setState("harsha");
        memento = original.createMemento();
        tracker.addMemento(memento);
        System.out.println(original.getState());

        original.setMemento(tracker.getMemento(0));
        System.out.println(original.getState());
    }
}
