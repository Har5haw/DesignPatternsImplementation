package Interpreter;

public class InterpreterDriver {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        String first = "13 to Binary";
        String second = "13 to Hex";
        System.out.println(interpret(first, interpreter));
        System.out.println(interpret(second, interpreter));
    }
    public static String interpret(String str, Interpreter interpreter){
        Expression expression = null;
        if(str.contains("Hex")){
            expression = new IntToHex(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else if(str.contains("Binary")){
            expression = new IntToBinary(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else return null;

        return expression.interpreter(interpreter);
    }
}
