package State;

public class Machine{
    private State startState;
    private State middleState;
    private State endState;

    private State state;

    public Machine(){
        this.startState = new StartState(this);
        this.middleState = new MiddleState(this);
        this.endState = new EndState(this);
        state = getStartState();
    }

    public void nextState() {
        state.nextState();
    }

    public void runStartOperations() {
        state.runStartOperations();
    }

    public void runMiddleOperations() {
        state.runMiddleOperations();
    }

    public void runEndOperations() {
        state.runEndOperations();
    }

    public State getStartState() {
        return startState;
    }

    public State getMiddleState() {
        return middleState;
    }

    public State getEndState() {
        return endState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
