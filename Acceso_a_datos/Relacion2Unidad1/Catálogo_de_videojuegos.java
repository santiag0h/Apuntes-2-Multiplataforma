package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Catálogo_de_videojuegos {
    public static void main(String[] args) {
        Path archivo=Path.of("videojuegos.csv");
        try{
            if(Files.notExists(archivo)){
                System.out.println("No existe el archivo de videojuegos");
                return;
            }
            List<String> primera =Files.readAllLines(
                archivo,StandardCharsets.UTF_8);
            
        }catch(IOException e){
            System.err.println("No se pudo modificar:"+e.getMessage());
        }
    }
}
