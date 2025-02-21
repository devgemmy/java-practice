package Exercise5;

import java.util.ArrayList;

public class MainClass5 {
    public static void main(String[] args) {
        Library brunelLib = new Library();
        brunelLib.addBook("The Obstacle is the way", "Ryan Holiday", true, 978);
        brunelLib.addBook("Originals", "Adam Grant", false, 506);
        brunelLib.addBook("The 48 Laws of Power", "Robert Greene", true, 373);

        brunelLib.displayBooks();

        ArrayList<Book> brunelLibList = brunelLib.getBooks();
        brunelLibList.get(1).borrowBook();
        brunelLibList.get(2).borrowBook();
//
        brunelLib.displayBooks();
//
        brunelLibList.get(1).returnBook();
        brunelLib.displayBooks();
    }
}
