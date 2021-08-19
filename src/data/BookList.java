package data;

import java.util.ArrayList;
import java.util.Collections;
import util.MyToys;

public class BookList {
    private ArrayList < Book > bookList = new ArrayList < > ();

    public ArrayList < Book > getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList < Book > bookList) {
        this.bookList = bookList;
    }

    public int searchBookByIsbn(String isbn) {
        for (int i = 0; i < bookList.size(); i++)
            if (bookList.get(i).getIsbn().compareToIgnoreCase(isbn) == 0)
                return i;
        return -1;
    }

    public Book searchObjectBookByIsbn(String isbn) {
        if (bookList.isEmpty())
            return null;
        for (Book book: bookList)
            if (book.getIsbn().compareToIgnoreCase(isbn) == 0)
                return book;
        return null;
    }

    private ArrayList < Book > searchListBookByTitle(String key) {
        ArrayList < Book > res = new ArrayList < > ();
        for (Book book: bookList)
            if (book.getTitle().contains(key))
                res.add(book);
        return res;
    }

    public void searchBookList() {
        if (bookList.isEmpty()) {
            System.out.println("The storage is empty. Nothing to print.");
            return;
        }
        String key = MyToys.getString("Enter book's title: ", "I can't understand you");
        key = key.toUpperCase();
        ArrayList < Book > res;
        res = searchListBookByTitle(key);
        if (res.isEmpty()) {
            System.err.println("No book is matched");
        } else {
            System.out.println("Here is books that you wanna search");
            String header = String.format("|%13s|%25s|%15s|%5s|",
                "ISBN", "TITLE", "AUTHOR", "PRICE");
            System.out.println(header);
            for (Book book: res)
                book.showDetail();
        }
    }
    
    public void addNewBook(AuthorList authorList) {
        if (authorList == null || authorList.getAuthorList().isEmpty()) {
            System.err.println("The author list is not loaded");
            return;
        }
        String isbn, title, authorId;
        double price;
        int pos;
        do {
            isbn = MyToys.getID("Enter book's ISBN\nISBN just includes 10 digits:   ", "Invalid", "^\\d{10}$");
            pos = searchBookByIsbn(isbn);
            if (pos != -1)
                System.err.println("This book ISBN is already exist");
        } while (pos != -1);
        title = MyToys.getAName("Enter book's title: ",
            "Title only contain alphabet");
        price = MyToys.getADouble("Enter book's price ($): ",
            "Price must be a positive real number", 0.1, 1000);
        do {
            authorId = MyToys.getID("Enter author's ID (AADDDDD)\nA matches any alphabet\nD matches any digit: ", "Invalid", "^[A-Za-z]{2}\\d{5}$");
            pos = authorList.searchAuthorById(authorId);
            if (pos != -1)
                System.err.println("This book ISBN is already exist");
        } while (pos != -1);
        boolean check = MyToys.getBoolean("Are you sure adding this book (Y/N): ",
            "Invalid");
        if (check) {
            bookList.add(new Book(isbn, title, price, authorId));
            System.out.println("A book's profile is sucessfully added");
        }
    }

    public void printBookListAscByTitle(AuthorList authorList) {
        if (bookList.isEmpty()) {
            System.out.println("The storage is empty. Nothing to print.");
            return;
        }
        Collections.sort(bookList);
        System.out.println("Here is the book list");
        System.out.println(" ____________________________________________________________________ ");
        String header = String.format("|%13s|%25s|%15s|%5s|",
            "ISBN", "TITLE", "AUTHOR", "PRICE");
        System.out.println(header);
        for (Book book: bookList) {
            book.showDetail(authorList);
        }
    }
}