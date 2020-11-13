package structural.bridge.src.example2;

import java.io.File;

public class ExcelCreatorImplementor implements FileCreator {

    @Override
    public File createFile(String fileName) {
        //Acá iría la lógica para crea un archivo de Excel, ir a base
        // de datos a buscar los datos para el archivo, etc
        return new File(String.format("Excel: %s", fileName));
    }
}
