package Adapter;

public class AdapterDriver {
    public static void main(String args[]){
        SocketAdapterInterface socketAdapter = new SocketAdapterImpl();
        Volt v120 = socketAdapter.get120Volts();
        Volt v1 = socketAdapter.get1Volt();
        Volt v12 = socketAdapter.get12Volts();
        Volt v3 = socketAdapter.get3Volts();
        System.out.println("v120 has volts:"+v120.getVolts());
        System.out.println("v12 has volts:"+v12.getVolts());
        System.out.println("v1 has volts:"+v1.getVolts());
        System.out.println("v3 has volts:"+v3.getVolts());
    }
}
