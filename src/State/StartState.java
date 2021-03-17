package State;

public class StartState implements State{

    Machine machine;

    public StartState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void nextState() {
        System.out.println("switching to middle state");
        machine.setState(machine.getMiddleState());
    }

    @Override
    public void runStartOperations() {
        System.out.println("yes we can run start operations");
    }

    @Override
    public void runMiddleOperations() {
        System.out.println("we cannot run this operation, we are in start state");
    }

    @Override
    public void runEndOperations() {
        System.out.println("we cannot run this operation, we are in start state");
    }
}
