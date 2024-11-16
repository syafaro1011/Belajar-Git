package Laihan_OOP;

public class Visitor extends Library {
    protected String visitorName;

    public Visitor(String libraryName, String visitorName) {
        super(libraryName);
        this.visitorName = visitorName;
    }

    @Override
    public void borrowBook(String title) {
        System.out.println(visitorName + " bukan member, anda tidak bisa meminjam buku.");
    }

    @Override
    public void returnBook(String title) {
        System.out.println(visitorName + " tidak ada buku yang harus dikembalikan.");
    }

    public void viewBooks() {
        System.out.println("Buku berada di " + getLibraryName() + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Visitor: " + visitorName + " mengunjungi " + getLibraryName());
    }
}
