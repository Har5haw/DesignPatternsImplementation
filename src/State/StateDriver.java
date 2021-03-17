package State;

public class StateDriver {
    public static void main(String[] args) {
        Machine machine = new Machine();

        machine.runStartOperations();
        machine.runMiddleOperations();
        machine.runEndOperations();

        System.out.println("----------------------");

        machine.nextState();
        machine.runStartOperations();
        machine.runMiddleOperations();
        machine.runEndOperations();

        System.out.println("----------------------");

        machine.nextState();
        machine.runStartOperations();
        machine.runMiddleOperations();
        machine.runEndOperations();

        machine.nextState();
    }
}
