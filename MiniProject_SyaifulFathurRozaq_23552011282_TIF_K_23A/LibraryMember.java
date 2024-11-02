package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String alamat;

    public LibraryMember(String name, int memberId, String alamat) {
        this.name = name;
        this.memberId = memberId;
        this.alamat = alamat;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    // Abstraksi metode umum yang harus diimplementasikan oleh subclass
    public abstract void borrowBook(Book book);
    public abstract void returnBook(int durasiPinjam, int waktuPengembalian, Book book);
}
