package behavioral.command.test;

import behavioral.command.FileSystemReceiver;
import behavioral.command.UnixFileSystemReceiver;
import behavioral.command.WindowsFileSystemReceiver;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void shouldOpenFileInUnix() {
        FileSystemReceiver fileSystemReceiver = new UnixFileSystemReceiver();
        assertEquals("Opening file in Unix", fileSystemReceiver.open());
    }

    @Test
    public void shouldWriteFileInWindows() {
        FileSystemReceiver fileSystemReceiver = new WindowsFileSystemReceiver();
        assertEquals("Writing file in Windows", fileSystemReceiver.write());
    }
}
