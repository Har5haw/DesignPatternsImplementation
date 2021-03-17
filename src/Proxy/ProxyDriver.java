package Proxy;

public class ProxyDriver {
    public static void main(String[] args) throws Exception {
        Proxy proxy = new Proxy();
        try{
            proxy.sendRequest("yalla habibi");
            proxy.sendRequest("legend");
            proxy.sendRequest("harsha");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
