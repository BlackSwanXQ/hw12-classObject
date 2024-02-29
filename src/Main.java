public class Main {
    public static void main(String[] args) {
        Autor lt = new Autor("Lev", "Tolstoy");
        Book wp = new Book("War and Peace", lt, 1990);
        wp.setYear(1995);
        System.out.println(wp);

        Autor tt = new Autor("Lev", "Tolstoy");
        Book pw = new Book("War and Peace", tt, 2000);
        pw.setYear(1995);
        System.out.println(pw);

        if (wp.hashCode() == pw.hashCode()) {
            if (wp.equals(pw)) {
                System.out.println("Объекты равны");
            } else {
                System.out.println("Хеш-коды равны,а объекты нет");
            }
        } else {
            System.out.println("Объекты не равны");
        }
    }
}