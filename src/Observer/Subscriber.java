package Observer;

public class Subscriber implements Listener{

    private String name;
    private Stream client;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = client.getUpdate(this);
        if(msg == null)
            System.out.println("No message");
        else
            System.out.println(name+" received message " + msg);
    }

    @Override
    public void setClient(Stream client) {
        this.client = client;
    }
}
