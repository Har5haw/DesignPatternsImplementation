package Proxy;

public class Server implements ServerInterface{
    @Override
    public void sendRequest(String clientName) throws Exception {
        System.out.println("request processed successfully Mr/Ms: "+clientName);
    }
}
