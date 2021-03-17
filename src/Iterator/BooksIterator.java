package Iterator;

public class BooksIterator implements Iterator {

    Product[] data;
    int pos = 0;

    public BooksIterator(Product[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if(pos >= data.length || data[pos] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Product next() {
        return data[pos++];
    }
}
