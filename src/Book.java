public class Book {
    private String bookName;
    private Author author;
    private int publicYear;

    public Book(String bookName, Author author, int publicYear) {
        this.bookName = bookName;
        this.author = author;
        this.publicYear = publicYear;
    }
    @Override
    public String toString() {
        return this.bookName + " " + this.author.getAuthorFamilyName() + " " + this.author.getAuthorName() + " " + this.publicYear;
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }
}
