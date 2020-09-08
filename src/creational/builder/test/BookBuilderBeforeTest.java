package creational.builder.test;

import creational.builder.example2.before.Book;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class BookBuilderBeforeTest {
    @Test
    public void shouldBuildABookWithNameAndAuthor() {
        Book book = new Book("Book 1", "Author 1");
        assertEquals("Book{isbn='null', name='Book 1', author='Author 1', releaseDate=null}", book.toString());
    }

    @Test
    public void shouldBuildABookWithIsbnAndReleaseDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.FEBRUARY, 1, 1, 1, 1);
        Book book = new Book("aert6789", calendar.getTime());
        assertEquals("Book{isbn='aert6789', name='null', author='null', releaseDate=Sat Feb 01 01:01:01 COT 2020}", book.toString());
    }
}
