package Exercise5;

import java.util.ArrayList;

class Library {
    private final ArrayList<Book> booksList = new ArrayList<Book>();

    // Getters
    public ArrayList<Book> getBooks() {
        return booksList;
    }

    public void addBook(String ttl, String auth, boolean status, int isbn) {
        Book sngBook;
        sngBook = new Book(ttl, auth, status, isbn);
        booksList.add(sngBook);
    }

    public void displayBooks() {
        String status;
        for (Book book : booksList) {

            if (book.isAvailable) status = "Available";
            else status = "Borrowed";

            System.out.println("Book " + book.book_id + ": \nTitle: " + book.title + "\nAuthor: " + book.author + "\nStatus: " + status);
            System.out.println("...........................");
        }
    }
}
