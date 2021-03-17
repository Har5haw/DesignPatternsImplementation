package Iterator;

public class Books {
    Product[] data;
    int max_data = 3;
    public Books(){
        data = new Product[max_data];
        data[0] = new Product("Legend", "Legal legends", 100.0);
        data[1] = new Product("Donkey", "Legal legends", 100.0);
        data[2] = new Product("Donkey Legend", "Legal legends", 100.0);
    }

    public BooksIterator createIterator(){
        return new BooksIterator(data);
    }
}
