package Laihan_OOP;
import java.util.ArrayList;
import java.util.List;

class Member extends Visitor {
    private List<Book> borrowedBooks;

    public Member(String libraryName, String visitorName) {
        super(libraryName, visitorName);
        borrowedBooks = new ArrayList<>();
    }

    @Override
    public void borrowBook(String title) {
        if (isBookAvailable(title)) {
            Book book = getBook(title);
            if (book != null) {
                book.borrowBook();
                borrowedBooks.add(book);
                System.out.println(visitorName + " meminjam buku: " + title);
            }
        } else {
            System.out.println("Buku \"" + title + "\" tidak ada.");
        }
    }

    @Override
    public void returnBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                borrowedBooks.remove(book);
                System.out.println(visitorName + " mengembalikan buku: " + title);
                return;
            }
        }
        System.out.println(visitorName + " tidak punya buku: " + title);
    }

    public void viewBorrowedBooks() {
        System.out.println(visitorName + "'s meminjam buku:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Member: " + visitorName + " dari perpustakaan " + getLibraryName());
    }
}
