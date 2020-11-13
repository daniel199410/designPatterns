package structural.bridge.src.example2;

import java.io.File;

public abstract class StoreService {
    private final FileCreator implementor;

    public StoreService(FileCreator implementor) {
        this.implementor = implementor;
    }

    public String store(String fileName) {
        File file = implementor.createFile(fileName);
        return storeImp(file);
    }

    protected abstract String storeImp(File file);

    public FileCreator getImplementor() {
        return implementor;
    }
}
