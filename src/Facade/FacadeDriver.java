package Facade;

public class FacadeDriver {
    public static void main(String args[]){
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Process3 p3 = new Process3();

        FacadeClass facadeClass = new FacadeClass(p1, p2, p3);
        facadeClass.start();
    }
}
