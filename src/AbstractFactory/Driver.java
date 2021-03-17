package AbstractFactory;

import java.util.Scanner;

public class Driver {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        CalculateFactory cFactory = new CalculateFactory();
        Calculate obj = cFactory.getObject(type);
        obj.calculate(a,b);
    }
}
