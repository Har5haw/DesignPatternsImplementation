package Facade;

public class FacadeClass {
    private Process1 p1;
    private Process2 p2;
    private Process3 p3;

    public FacadeClass(Process1 p1, Process2 p2, Process3 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void start(){
        p1.run();
        p2.run();
        p3.run();
    }
}
