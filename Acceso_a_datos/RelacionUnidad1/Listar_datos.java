package RelacionUnidad1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Listar_datos {
    public static void main(String[] args) {
        Path ruta = Path.of("datos");
        if(Files.notExists(ruta)){
            System.out.println("No existe la carpeta datos");
        }else{
            try(DirectoryStream<Path> archivos=Files.newDirectoryStream(ruta)){
                for(Path archivo:archivos){
                    if(Files.isRegularFile(archivo)){
                        System.out.println("-- "+archivo.getFileName());
                    }
                }
            }catch(IOException e){
                System.err.println("No se pudo leer la carpeta:" + e.getMessage());
            }
        }
    }
}
