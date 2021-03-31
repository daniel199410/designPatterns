package behavioral.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public String open() {
        return "Opening file in Windows";
    }

    @Override
    public String write() {
        return "Writing file in Windows";
    }

    @Override
    public String close() {
        return "Cloding file in Windows";
    }
}
