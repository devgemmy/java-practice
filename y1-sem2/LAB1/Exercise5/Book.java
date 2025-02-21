package Exercise5;

public class Book {
    String title;
    String author;
    int book_id;
    boolean isAvailable;

    public Book(String ttl, String auth, boolean isThere, int ISBN) {
        title = ttl;
        author = auth;
        book_id = ISBN;
        isAvailable = isThere;
    }

    // Methods
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\nBook " + book_id + " has just been taken.\n");
        }
        else System.out.println("\nBook " + book_id + " is already borrowed.\n");
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("\nBook " + book_id + " has been returned.\n");
    }
}

