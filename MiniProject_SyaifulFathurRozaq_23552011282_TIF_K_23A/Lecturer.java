package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

public class Lecturer extends LibraryMember {
    private String kode_dosen;

    public Lecturer(String name, int memberId, String kode_dosen) {
        super(name, memberId, kode_dosen);
        this.kode_dosen = kode_dosen;
    }

    public String getKodeDosen() {
        return kode_dosen;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Lecturer) telah meminjam buku: " + book.getTitle());
        } else {
            System.out.println("Maaf buku " + book.getTitle() + " tidak tersedia");
        }
    }

    public void returnBook(int durasiPinjam, int waktuPengembalian, Book book) {
        if (durasiPinjam < waktuPengembalian) {
            int denda = book.getPrice() * 10 / 100;
            System.out.println();
            System.out.println(getName()+" telat mengembalikan buku "+book.getTitle());
            System.out.println("Anda dikenakan denda sebesar Rp. "+denda);
        }else {
            System.out.println("Terima kasih sudah mengembalikan");
        }
    }
}
