public class Main {
    public static void main(String[] args) {
        Author ivanov = new Author("Ivan", "Ivanov");
        Author petrov = new Author("Petr", "Petrov");
        Book firstBook = new Book("Ivanov's book", ivanov, 2020);
        Book secondBook = new Book("Petrov's book", petrov, 2022);

        System.out.println("firstBook = " + firstBook.getPublicYear());
        firstBook.setPublicYear(2000);
        System.out.println("firstBook = " + firstBook.getPublicYear());

        System.out.println(petrov);

        System.out.println("ivanov.getAuthorFamilyName() = " + ivanov.getAuthorFamilyName());
        System.out.println(firstBook);
        System.out.println(firstBook.getBookName() + ": " + firstBook.hashCode());
        System.out.println(secondBook.getBookName() + ": " + secondBook.hashCode());

        System.out.println(ivanov.equals(ivanov));
        System.out.println(ivanov.equals(petrov));
        System.out.println(firstBook.equals(secondBook));
        System.out.println(firstBook.equals(firstBook));
    }
}