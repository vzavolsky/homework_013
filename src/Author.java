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
        if (this.getClass() == other.getClass()) {
            return true;
        }
        return false;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorFamilyName() {
        return this.authorFamilyName;
    }
}
