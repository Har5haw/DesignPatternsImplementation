package Iterator;

public class Shop {
    Books books;
    Shirts shirts;

    public Shop(Books books, Shirts shirts) {
        this.books = books;
        this.shirts = shirts;
    }

    void printData(){
        BooksIterator booksIterator = books.createIterator();
        printData(booksIterator);
        ShirtsIterator shirtsIterator = shirts.createIterator();
        printData(shirtsIterator);
    }

    void printData(BooksIterator booksIterator){
        while(booksIterator.hasNext()){
            Product product = booksIterator.next();
            System.out.println(product.getName() +"--"+product.getDescription()+"--"+product.getPrice());
        }
    }

    void printData(ShirtsIterator shirtsIterator){
        while (shirtsIterator.hasNext()){
            Product product = shirtsIterator.next();
            System.out.println(product.getName() +"--"+product.getDescription()+"--"+product.getPrice());
        }
    }
}
