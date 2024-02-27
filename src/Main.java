public class Main {
    public static void main(String[] args) {
        Autor lt = new Autor("Lev", "Tolstoy");
        Book wp = new Book("War and Peace", lt, 1990);
        wp.setYear(1995);
        System.out.println(wp.getTitleBook() + ", " + wp.getName() + ", " + wp.getYear());

        Autor tt = new Autor("Tiger", "Tolstoy");
        Book pw = new Book("Peace and War", tt, 2000);
        pw.setYear(2005);
        System.out.println(pw.getTitleBook() + ", " + pw.getName() + ", " + pw.getYear());
    }
}