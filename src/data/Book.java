package data;

public class Book {
    private String isbn;
    private String title;
    private double price; 
    private String authorId;

    public Book(String isbn, String title, double price, String authorId) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.authorId = authorId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return isbn + "," + title + "," + price + "," + authorId;
    }
    
}
