package behavioral.command;

public class WriteFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public String execute() {
        return this.fileSystemReceiver.write();
    }
}
