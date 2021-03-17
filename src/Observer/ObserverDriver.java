package Observer;

public class ObserverDriver {
    public static void main(String[] args) {
        Server server = new Server();

        Listener listener1 = new Subscriber("shaw");
        Listener listener2 = new Subscriber("harsha");
        Listener listener3 = new Subscriber("vardhan");

        server.register(listener1);
        server.register(listener2);
        server.register(listener3);

        listener1.setClient(server);
        listener2.setClient(server);
        listener3.setClient(server);

        server.sendMsg("hai hello");

        server.unregister(listener2);

        server.sendMsg("hai hello");
    }
}
