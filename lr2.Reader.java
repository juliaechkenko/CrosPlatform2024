import java.io.Serializable;

// Клас, що представляє читача
public class Reader implements Serializable {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    // Геттери та сеттери

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                '}';
    }
}
