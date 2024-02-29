import java.util.Objects;

public class Book {
    private String titleBook;
    private Autor name;
    private int year;

    public Book(String titleBook, Autor name, int year) {
        this.titleBook = titleBook;
        this.name = name;
        this.year = year;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Autor getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", name=" + name +
                ", year=" + year +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(titleBook, book.titleBook) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, name, year);
    }
}
