package Laihan_OOP;

public class main {
    public static void main(String[] args) {
        // Create Library
        Library library = new Visitor("Central Library", "Guest_1"); // Polymorphism

        // Add Books
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Visitor melihat buku
        Visitor visitor = new Visitor("Central Library", "Siti");
        visitor.books = library.books; // Share library's books with visitor
        visitor.displayInfo();
        visitor.viewBooks();

        // Visitor mencoba meminjam buku
        visitor.borrowBook("1984");

        // Member meminjam dan mengembalikan buku
        Member member = new Member("Central Library", "Kepin");
        member.books = library.books; // Share library's books with member

        member.displayInfo();
        member.borrowBook("1984");
        member.borrowBook("To Kill a Mockingbird");
        member.viewBorrowedBooks();

        member.returnBook("1984");
        member.viewBorrowedBooks();

        // Member meminjam buku yang tidak ada
        member.borrowBook("1984");
    }
}
