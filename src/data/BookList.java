package data;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
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
        for (Book book : bookList) 
            if (book.getIsbn().compareToIgnoreCase(isbn) == 0) 
                return book;
        return null;                
    }
    
    private ArrayList < Book > searchListPhoneByTitle(String key) {
        ArrayList < Book > res = new ArrayList < > ();
        for (Book book : bookList) 
            if (book.getTitle().contains(key)) 
                res.add(book);
        return res;
    }
}
