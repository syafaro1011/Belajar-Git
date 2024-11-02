package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

public class Student extends LibraryMember {
    private String nim;

    public Student(String name, int memberId, String nim) {
        super(name, memberId, nim);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " telah meminjam buku: " + book.getTitle());
        } else {
            System.out.println("Maaf buku " + book.getTitle() + " tidak tersedia");
        }
    }

    public void returnBook(int durasiPinjam, int waktuPengembalian, Book book) {
        if (durasiPinjam < waktuPengembalian) {
            int denda = book.getPrice() * 10 / 100;
            System.out.println(getName()+" telat mengembalikan buku "+book.getTitle());
            System.out.println("Anda dikenakan denda sebesar Rp. "+denda);
        }else {
            System.out.println("Terima kasih sudah mengembalikan");
        }
    }
}