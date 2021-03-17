package Iterator;

import java.util.ArrayList;

public class ShirtsIterator implements Iterator{

    private ArrayList<Product> data;
    int pos = 0;

    public ShirtsIterator(ArrayList<Product> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        if(pos >= data.size() || data.get(pos) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Product next() {
        return data.get(pos++);
    }
}
