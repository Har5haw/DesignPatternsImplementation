package Interpreter;

public class IntToBinary implements Expression{
    int i;

    public IntToBinary(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(Interpreter interpreter) {
        return interpreter.toBinary(i);
    }
}
