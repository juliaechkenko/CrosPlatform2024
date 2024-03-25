import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Клас, що представляє бібліотеку
public class Library implements Serializable {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    // Метод для виведення поточного стану бібліотеки
    public void printLibraryStatus() {
        System.out.println("Books in library:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nReaders in library:");
        for (Reader reader : readers) {
            System.out.println(reader);
        }
    }
}
