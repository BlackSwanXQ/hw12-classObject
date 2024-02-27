public class Book {
    private String titleBook;
    private Autor name;
    private int year;

    public String getTitleBook() {
        return titleBook;
    }

    public String getName() {
        return name.getFirstName() + " " + name.getLastName();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String titleBook, Autor name, int year) {
        this.titleBook = titleBook;
        this.name = name;
        this.year = year;
    }
}
