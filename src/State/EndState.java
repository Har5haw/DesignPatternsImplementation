package State;

public class EndState implements State{

    Machine machine;

    public EndState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void nextState() {
        System.out.println("There is no next state");
    }

    @Override
    public void runStartOperations() {
        System.out.println("we cannot run this operation, we are in end state");
    }

    @Override
    public void runMiddleOperations() {
        System.out.println("we cannot run this operation, we are in end state");
    }

    @Override
    public void runEndOperations() {
        System.out.println("we can run this operation");
    }
}
