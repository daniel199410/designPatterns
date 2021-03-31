package behavioral.command;

public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public String execute() {
        return command.execute();
    }
}
