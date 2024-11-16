package Laihan_OOP;

import java.util.ArrayList;
import java.util.List;


// Abstrak Class Library
public abstract class Library {
    private String libraryName;
    List<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return true;
            }
        }
        return false;
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public String getLibraryName() {
        return libraryName;
    }

    // Abstraksi untuk peminjman dan pengenbalian
    public abstract void borrowBook(String title);

    public abstract void returnBook(String title);

    public abstract void displayInfo();

}
