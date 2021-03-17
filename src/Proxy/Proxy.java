package Proxy;

import java.util.ArrayList;

public class Proxy implements ServerInterface{
    private Server server = new Server();
    private static ArrayList<String> bannedClients;

    static {
        bannedClients = new ArrayList<>();
        bannedClients.add("shaw");
        bannedClients.add("harsha");
        bannedClients.add("hacker");
    }


    @Override
    public void sendRequest(String clientName) throws Exception {
        if(bannedClients.contains(clientName)){
            throw new Exception("You are banned from the server, you cannot access data");
        }else{
            server.sendRequest(clientName);
        }
    }
}
