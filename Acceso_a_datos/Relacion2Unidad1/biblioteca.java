package Relacion2Unidad1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class biblioteca {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","reservas.csv");
        if(!Files.exists(ruta)){
            System.out.println("El archivo no existe: "+ ruta);
            return;
        }else if(!Files.isRegularFile(ruta)){
            System.out.println("El tipo de archivo no es correcto: "+ruta);
        }
        try{
            
        }catch(IOException e){
            System.err.println("Ha ocurrido un errror:"+e);
        }
    }
}
