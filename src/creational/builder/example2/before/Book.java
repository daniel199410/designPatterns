package creational.builder.example2.before;

import java.util.Date;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private  Date releaseDate;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String isbn, Date releaseDate) {
        this.isbn = isbn;
        this.releaseDate = releaseDate;
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
