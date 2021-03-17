package Interpreter;

public class IntToHex implements Expression{
    int i;

    public IntToHex(int i) {
        this.i = i;
    }

    @Override
    public String interpreter(Interpreter interpreter) {
        return interpreter.toHex(i);
    }
}
