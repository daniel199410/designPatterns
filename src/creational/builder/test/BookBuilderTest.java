package creational.builder.test;

import creational.builder.example2.after.Book;
import creational.builder.example2.after.FilterBookBuilder;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class BookBuilderTest {
	
	@Test
    public void shouldBuildABookWithNameAndAuthor() {
        Book book = new FilterBookBuilder()
                .setName("Book 1")
                .setAuthor("Author 1")
                .build();
        assertEquals("Book{isbn='null', name='Book 1', author='Author 1', releaseDate=null}", book.toString());
    }

    @Test
    public void shouldBuildABookWithIsbnAndReleaseDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.FEBRUARY, 1, 1, 1, 1);
        Book book = new FilterBookBuilder()
                .setIsbn("aert6789")
                .setReleaseDate(calendar.getTime())
                .build();
        assertEquals(
                "Book{isbn='aert6789', name='null', author='null', releaseDate=Sat Feb 01 01:01:01 COT 2020}",
                book.toString()
        );
    }
}
