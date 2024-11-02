package MiniProject_SyaifulFathurRozaq_23552011282_TIF_K_23A;

public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private int price;
    private String description;
    

    // Constructor
    public Book(String title, String author, int price, String description ) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Default: Book is available when created
        this.price = price;
        this.description = description;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for availability
    public boolean isAvailable() {
        return isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Setter to change availability
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    
}