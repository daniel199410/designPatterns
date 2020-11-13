package structural.bridge.src.example2;

import java.io.File;

public class AWSStoreImpl extends StoreService {
    public AWSStoreImpl(FileCreator implementor) {
        super(implementor);
    }

    @Override
    protected String storeImp(File file) {
        //Acá iría la lógica como tal para almacenar el archivo en AWS
        return String.format("%s stored in aws", file.getName());
    }
}
