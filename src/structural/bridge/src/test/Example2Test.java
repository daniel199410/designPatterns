package structural.bridge.src.test;

import org.junit.Test;
import structural.bridge.src.example2.AWSStoreImpl;
import structural.bridge.src.example2.ExcelCreatorImplementor;
import structural.bridge.src.example2.LocalStoreImpl;
import structural.bridge.src.example2.PDFCreatorImplementor;

import static org.junit.Assert.assertEquals;

public class Example2Test {
    @Test
    public void shouldPersistExcelLocally() {
        assertEquals(
                "Excel: File 1 Stored in file system",
                new LocalStoreImpl(new ExcelCreatorImplementor()).store("File 1")
        );
    }

    @Test
    public void shouldPersistRemotely() {
        assertEquals(
                "PDF: File 1 stored in aws",
                new AWSStoreImpl(new PDFCreatorImplementor()).store("File 1")
        );
    }
}
