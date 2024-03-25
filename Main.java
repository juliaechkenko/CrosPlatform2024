import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів авторів, книг, читачів та бібліотеки
        Author author1 = new Author("Cassandra Kler");
        Author author2 = new Author("Li Bardygo");

        Book book1 = new Book("City of bones", author1);
        Book book2 = new Book("Six of crows", author2);

        Reader reader1 = new Reader("Julia");
        Reader reader2 = new Reader("Valeria");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addReader(reader1);
        library.addReader(reader2);

        // Виведення поточного стану бібліотеки
        System.out.println("Current state of the library:");
        library.printLibraryStatus();

        // Серіалізація об'єкту бібліотеки у файл
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("library.ser"))) {
            outputStream.writeObject(library);
            System.out.println("Library serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десеріалізація об'єкту бібліотеки з файлу
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("library.ser"))) {
            Library deserializedLibrary = (Library) inputStream.readObject();
            System.out.println("\nDeserialized library:");
            deserializedLibrary.printLibraryStatus();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
