package behavioral.command;

public class OpenFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public String execute() {
        return this.fileSystemReceiver.open();
    }
}
