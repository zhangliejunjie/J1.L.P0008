package data;

public class Book implements Comparable < Book > {
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

    public void showDetail() {
        System.out.printf("|%13s|%-25s|%-15s|%-5.2f|\n",
            isbn, title, authorId, price);
    }
    //0-306-40615-2
    public void showDetail(AuthorList authorList) {
        Author aut = authorList.searchObjectAuthorById(authorId);

        if (aut != null) {
            System.out.printf("|%13s|%-25s|%-15s|%-5.2f|\n",
                isbn, title, aut.getName(), price);
        } else {
            System.out.printf("|%13s|%-25s|%-15s|%-5.2f|\n",
                isbn, title, "Unknown", price);
        }
    }

    @Override
    public int compareTo(Book that) {
        return this.title.compareToIgnoreCase(that.getTitle());
    }
}