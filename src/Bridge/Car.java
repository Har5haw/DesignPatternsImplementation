package Bridge;

public class Car extends Vehicle{

    public Car(WorkShop shop1, WorkShop shop2){
        super(shop1, shop2);
    }
    @Override
    public void manufacture() {
        System.out.println("Car");
        shop1.make();
        shop2.make();
    }
}
