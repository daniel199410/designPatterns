package behavioral.command;

public class CloseFileCommand implements Command {
    private final FileSystemReceiver fileSystemReceiver;

    public CloseFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public String execute() {
        return this.fileSystemReceiver.close();
    }
}
