package behavioral.command.test;

import behavioral.command.FileInvoker;
import behavioral.command.FileSystemReceiver;
import behavioral.command.OpenFileCommand;
import behavioral.command.UnixFileSystemReceiver;
import behavioral.command.WindowsFileSystemReceiver;
import behavioral.command.WriteFileCommand;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandTest {
    @Test
    public void shouldOpenFileInUnix() {
        FileSystemReceiver fileSystemReceiver = new UnixFileSystemReceiver();
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);
        assertEquals("Opening file in Unix", fileInvoker.execute());
    }

    @Test
    public void shouldWriteFileInWindows() {
        FileSystemReceiver fileSystemReceiver = new WindowsFileSystemReceiver();
        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker = new FileInvoker(writeFileCommand);
        assertEquals("Writing file in Windows", fileInvoker.execute());
    }
}
