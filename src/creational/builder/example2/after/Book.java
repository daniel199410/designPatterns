package creational.builder.example2.after;

import java.util.Date;

public class Book {
    private final String isbn;
    private final String name;
    private final String author;
    private final Date releaseDate;

    Book(FilterBookBuilder filterBookBuilder) {
        this.isbn = filterBookBuilder.getIsbn();
        this.name = filterBookBuilder.getName();
        this.author = filterBookBuilder.getAuthor();
        this.releaseDate = filterBookBuilder.getReleaseDate();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
