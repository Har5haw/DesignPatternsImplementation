package Iterator;

public class IteratorDriver {
    public static void main(String[] args) {
        Books books = new Books();
        Shirts shirts = new Shirts();

        Shop shop = new Shop(books, shirts);

        shop.printData();

    }
}
