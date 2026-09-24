package Acceso_a_datos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Preparar_carpetas{
    public static void main(String[] args) {
        Path ruta = Path.of("datos");
        Path copias = ruta.resolve("copias");
        Path clubes = ruta.resolve("clubes.txt");
        Path respaldo = copias.resolve("respaldo.txt");
        try{
            if(Files.notExists(ruta)){
                Files.createDirectories(ruta);
            }else{
                System.out.println("Pesa "+Files.size(ruta));//hay que refaroctizar todo esto y hacer que funcione a base de un metodo y hacer un codigo mas limpio
            }
            if(Files.notExists(copias)){
                Files.createDirectories(copias);
            }else{
                System.out.println("Pesa "+Files.size(copias));
            }
            if(Files.notExists(clubes)){
                Files.createFile(clubes);
            }else{
                System.out.println("Pesa "+Files.size(clubes));
            }
            if(Files.notExists(respaldo)){
                Files.createFile(respaldo);
            }else{
                System.out.println("Pesa "+Files.size(respaldo));
            }
        }catch (IOException e) {
            System.err.println("No se pudo guardar: " + e.getMessage());
        }
        
    }
}