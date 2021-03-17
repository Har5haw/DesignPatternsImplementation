package Bridge;

public class Bike extends Vehicle {
    public Bike(WorkShop shop1, WorkShop shop2){
        super(shop1, shop2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        shop1.make();
        shop2.make();
    }
}
