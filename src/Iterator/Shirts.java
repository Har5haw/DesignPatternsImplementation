package Iterator;

import java.util.ArrayList;

public class Shirts {
    ArrayList<Product> data;
    int max_len = 3;
    public Shirts(){
        data = new ArrayList<Product>();
        data.add(new Product("Marvel", "Avengers", 500.0));
        data.add(new Product("Hulk", "Avengers", 500.0));
        data.add(new Product("Legend of Hulk", "Avengers", 500.0));
    }

    public ShirtsIterator createIterator(){
        return new ShirtsIterator(data);
    }
}
