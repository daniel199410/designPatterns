package structural.bridge.src.example2;

import java.io.File;

public class PDFCreatorImplementor implements FileCreator {

    @Override
    public File createFile(String fileName) {
        //Acá iría la lógica para crear un archivo PDF,
        // ir a base de datos a buscar los datos para el archivo, etc
        return new File(String.format("PDF: %s", fileName));
    }
}
