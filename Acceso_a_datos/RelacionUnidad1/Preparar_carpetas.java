package RelacionUnidad1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Preparar_carpetas{
    public static void main(String[] args) {
        Path ruta = Path.of("datos");
        Path copias = ruta.resolve("copias");
        Path clubes = ruta.resolve("clubes.txt");
        Path respaldo = copias.resolve("respaldo.txt");
        comprobar(ruta,1);
        comprobar(copias,1);
        comprobar(clubes,2);
        comprobar(respaldo,2);
        }
        public static void comprobar(Path Rut,int tipo){
        try{
            if(Files.notExists(Rut)){
                if(tipo==1){
                    Files.createDirectories(Rut);
                }else{
                    Files.createFile(Rut);
                }
                System.out.println(Rut.toAbsolutePath());
            }else{
                System.out.println("Pesa "+Files.size(Rut));
                System.out.println(Rut.toAbsolutePath());
            }
        }catch (IOException e) {
            System.err.println("No se pudo guardar: " + e.getMessage());
        }
    }
        
    
}