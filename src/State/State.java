package State;

public interface State {
    void nextState();
    void runStartOperations();
    void runMiddleOperations();
    void runEndOperations();
}
