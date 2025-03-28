import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigital Library System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> library.addBook();
                case 2 -> library.viewBooks();
                case 3 -> library.searchBook();
                case 4 -> library.updateBook();
                case 5 -> library.deleteBook();
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
