public class Book {
    private String titleBook;
    private Author author;
    private int yearPublic;

    public Book(String titleBook, Author author, int yearPublic) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
}
