package Observer;

import java.util.ArrayList;

public class Server implements Stream {

    private ArrayList<Listener> listeners;
    private String message;

    public Server(){
        listeners = new ArrayList<>();
    }

    @Override
    public void register(Listener listener) {
        if(listeners.contains(listener)){
            System.out.println("already exist");
        }else{
            listeners.add(listener);
        }
    }

    @Override
    public void unregister(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        for(Listener listener : listeners){
            listener.update();
        }
    }

    @Override
    public String getUpdate(Listener listener) {
        return this.message;
    }

    void sendMsg(String msg){
        System.out.println("Message posted to topic : "+msg);
        this.message = msg;
        notifyListeners();
    }
}
