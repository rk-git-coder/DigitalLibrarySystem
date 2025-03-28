public class Book {
    private String bookID, title, author, genre;
    private String availability;

    public Book(String bookID, String title, String author, String genre, String availability) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = availability;
    }

    public String getBookID() { return bookID; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public String getAvailability() { return availability; }
    
    public void setAvailability(String availability) { this.availability = availability; }

    public void display() {
        System.out.println("Book ID: " + bookID + " | Title: " + title + " | Author: " + author +
                " | Genre: " + genre + " | Availability: " + availability);
    }
}
