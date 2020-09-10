package creational.builder.example2.after;

import java.util.Date;

public class FilterBookBuilder implements BookBuilder {

    private String isbn;
    private String name;
    private String author;
    private Date releaseDate;

    @Override
    public BookBuilder setIsbn(String isbn) {
        this.isbn = isbn;
        return this;
    }

    @Override
    public BookBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    @Override
    public BookBuilder setReleaseDate(Date date) {
        this.releaseDate = date;
        return this;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public Book build() {
        return new Book(this);
    }
}
