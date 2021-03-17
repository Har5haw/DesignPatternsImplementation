package State;

public class MiddleState implements State{

    Machine machine;

    public MiddleState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void nextState() {
        System.out.println("switching to end state");
        machine.setState(machine.getEndState());
    }

    @Override
    public void runStartOperations() {
        System.out.println("we cannot run this operation, we are in middle state");
    }

    @Override
    public void runMiddleOperations() {
        System.out.println("we can run this operation");
    }

    @Override
    public void runEndOperations() {
        System.out.println("we cannot run this operation, we are in middle state");
    }
}
