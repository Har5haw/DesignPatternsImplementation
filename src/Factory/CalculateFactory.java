package Factory;

public class CalculateFactory {
    public Calculate getObject(String type){
        if(type.equalsIgnoreCase("add")){
            return new Add();
        }else if(type.equalsIgnoreCase("subtract")) {
            return new Subtract();
        }else if(type.equalsIgnoreCase("divide")){
            return new Divide();
        }
        return null;
    }
}
