
public class Book implements Packable {
    private double weight;
    private String author;
    private String bookName;
    public Book(String author, String bookName, double weight){
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }
    @Override
    public double weight() {
        return weight;
    }
    public String toString(){
        return author+": " + bookName;
    }
}
