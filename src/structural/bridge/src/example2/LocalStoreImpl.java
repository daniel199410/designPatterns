package structural.bridge.src.example2;

import java.io.File;

public class LocalStoreImpl extends StoreService {

    public LocalStoreImpl(FileCreator implementor) {
        super(implementor);
    }

    @Override
    protected String storeImp(File file) {
        //Acá iría la lógica como tal para almacenar el archivo localmente
        return String.format("%s Stored in file system", file.getName());
    }
}
