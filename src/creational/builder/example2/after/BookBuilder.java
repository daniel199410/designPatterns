package creational.builder.example2.after;

import java.util.Date;

public interface BookBuilder {
    BookBuilder setIsbn(String isbn);
    BookBuilder setName(String name);
    BookBuilder setAuthor(String author);
    BookBuilder setReleaseDate(Date date);
    Book build();
}
