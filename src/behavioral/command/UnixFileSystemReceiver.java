package behavioral.command;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public String open() {
        return "Opening file in Unix";
    }

    @Override
    public String write() {
        return "Writing file in Unix";
    }

    @Override
    public String close() {
        return "Cloding file in Unix";
    }
}
