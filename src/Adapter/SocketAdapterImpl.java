package Adapter;

public class SocketAdapterImpl implements SocketAdapterInterface{

    private Socket socket = new Socket();
    @Override
    public Volt get12Volts() {
        Volt volt = socket.getVolts();
        return divide(volt, 10);
    }

    @Override
    public Volt get120Volts() {
        Volt volt = socket.getVolts();
        return volt;
    }

    @Override
    public Volt get1Volt() {
        Volt volt = socket.getVolts();
        return divide(volt, 120);
    }

    @Override
    public Volt get3Volts() {
        Volt volt = socket.getVolts();
        return divide(volt, 40);
    }

    private Volt divide(Volt volt, int i){
        return new Volt(volt.getVolts()/i);
    }
}
