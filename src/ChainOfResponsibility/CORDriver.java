package ChainOfResponsibility;

public class CORDriver {
    public static void main(String[] args) {
        LessThan10 lessThan10 = new LessThan10();
        LessThan100 lessThan100 = new LessThan100();
        LessThan1000 lessThan1000 = new LessThan1000();

        lessThan10.setNext(lessThan100);
        lessThan100.setNext(lessThan1000);
        lessThan1000.setNext(null);

        lessThan10.process(9);
        lessThan10.process(99);
        lessThan10.process(999);
        lessThan10.process(9999);
    }
}
