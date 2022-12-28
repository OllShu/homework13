import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int yearPublication;

    public Book(String titleBook, Author author, int yearPublication) {
        this.titleBook = titleBook;
        this.author = new Author(author.getName(), author.getSurname());
        this.yearPublication = yearPublication;

    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return " "+ titleBook +" "+ author+" "+yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && titleBook.equals(book.titleBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, author, yearPublication);
    }
}
