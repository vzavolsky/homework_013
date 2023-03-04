public class Main {
    public static void main(String[] args) {
        Author ivanov = new Author("Ivan", "Ivanov");
        Author petrov = new Author("Petr", "Petrov");
        Book firstBook = new Book("Ivanov's book", ivanov, 2020);
        Book secondBook = new Book("Petrov's book", petrov, 2022);

        System.out.println("firstBook = " + firstBook.getPublicYear());
        firstBook.setPublicYear(2000);
        System.out.println("firstBook = " + firstBook.getPublicYear());

        System.out.println("ivanov.getAuthorFamilyName() = " + ivanov.getAuthorFamilyName());
    }
}