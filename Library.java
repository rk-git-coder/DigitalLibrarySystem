import java.util.*;

public class Library {
    private ArrayList<Book> books;
    private Scanner sc;

    public Library() {
        books = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = sc.next();
        System.out.print("Enter Title: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        System.out.print("Enter Genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = sc.next();

        books.add(new Book(bookID, title, author, genre, availability));
        System.out.println("Book Added Successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                book.display();
            }
        }
    }

    public void searchBook() {
        System.out.print("Enter Book ID or Title to Search: ");
        sc.nextLine();
        String searchQuery = sc.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(searchQuery) || book.getTitle().equalsIgnoreCase(searchQuery)) {
                book.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
    }

    public void updateBook() {
        System.out.print("Enter Book ID to Update: ");
        String bookID = sc.next();
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                System.out.print("Enter new Availability (Available/Checked Out): ");
                book.setAvailability(sc.next());
                System.out.println("Book Updated Successfully!");
                return;
            }
        }
        System.out.println("Book ID not found!");
    }

    public void deleteBook() {
        System.out.print("Enter Book ID to Delete: ");
        String bookID = sc.next();
        books.removeIf(book -> book.getBookID().equals(bookID));
        System.out.println("Book Deleted Successfully!");
    }
}
