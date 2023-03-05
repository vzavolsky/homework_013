import java.util.Objects;

public class Author {
    private String  authorName;
    private String authorFamilyName;

    public Author(String authorName, String authorFamilyName) {
        this.authorName = authorName;
        this.authorFamilyName = authorFamilyName;
    }
    @Override
    public String toString() {
        return this.authorName + " " + this.authorFamilyName;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorFamilyName, author.authorFamilyName);
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFamilyName() {
        return this.authorFamilyName;
    }
}
