import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    ArrayList<Book> lst = new ArrayList<>();

    void addBook(Book b) {
        lst.add(b);
    }

    void displayAllBooks() {
        if (lst.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        
        for (Book b : lst) {
            System.out.println("Title: " + b.title + " | Author: " + b.author + " | ISBN: " + b.isbn);
        }
    }

    Book searchByTitle(String searchTitle) {
        for (Book b : lst) {
            if (b.title.equalsIgnoreCase(searchTitle)) {
                return b; 
            }
        }
        return null;
    }
}

public class Scenario1 {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book("A1", "B1", "9780743273565"));
        myLibrary.addBook(new Book("A2", "B2", "9780451524935"));
        System.out.println("--- All Books in Library ---");
        myLibrary.displayAllBooks();

        Book foundBook = myLibrary.searchByTitle("A2");
        
        if (foundBook != null) {
            System.out.println("Found: " + foundBook.title + " by " + foundBook.author);
        } else {
            System.out.println("Book not found.");
        }

        Book notFoundBook = myLibrary.searchByTitle("A3");
        
        if (notFoundBook != null) {
            System.out.println("Found: " + notFoundBook.title + " by " + notFoundBook.author);
        } else {
            System.out.println("Book not found.");
        }
    }    
}