import java.util.Objects;

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
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Object book = (Book) other;
        return Objects.equals(bookName, ((Book) other).bookName) && Objects.equals(publicYear, ((Book) other).publicYear);
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
