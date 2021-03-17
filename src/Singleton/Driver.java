package Singleton;

public class Driver {
    public static void main(String args[]){
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
