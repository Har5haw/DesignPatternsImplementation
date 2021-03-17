package Bridge;

public abstract class Vehicle {
    protected WorkShop shop1;
    protected WorkShop shop2;

    public Vehicle(WorkShop shop1, WorkShop shop2) {
        this.shop1 = shop1;
        this.shop2 = shop2;
    }

    public abstract void manufacture();
}
