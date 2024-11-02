package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        // Menambahkan buku ke dalam ArrayList
        bookList.add(new Book("1984", "George Orwell", 100000, "History book"));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 200000, "Fantasy book"));
        System.out.println(bookList);
        
        //inisialisasi variable elemen dalam arraylist
        Book book1 = bookList.get(0);
        Book book2 = bookList.get(1); 

        LibraryMember student = new Student("Alice", 1001, "628726");
        LibraryMember lecturer = new Lecturer("Mr. Smith", 2001, "GHJ678" );

        // Polymorphism: Both student and teacher are treated as LibraryMember
        student.borrowBook(book1); // Alice (Student) borrows "The Great Gatsby"
        System.out.println("");
        lecturer.borrowBook(book1); // "The Great Gatsby" is already borrowed, so Mr. Smith can't borrow it.
        System.out.println("");
        lecturer.borrowBook(book2); // Mr. Smith (Teacher) borrows "1984"
        System.out.println("");

        student.returnBook(7, 10, book1);
        System.out.println("");
        lecturer.returnBook(7, 6, book2);
        System.out.println("");
    }
}