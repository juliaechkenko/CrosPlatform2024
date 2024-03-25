import java.io.Serializable;

// Клас, що представляє автора
public class Author implements Serializable {
    private String name;

    public Author(String name) {
        this.name = name;
    }

    // Геттери та сеттери

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
