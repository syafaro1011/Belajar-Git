package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

public class BorrowReturnBook {
    public void borrowBook(Book book, LibraryMember name) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name.getName() + " telah meminjam buku: " + book.getTitle());
        } else {
            System.out.println("Maaf buku " + book.getTitle() + " tidak ada");
        }
    }
}
