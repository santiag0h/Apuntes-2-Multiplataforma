package Relacion2Unidad1;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Utiles {

    public static String escanerTexto(Scanner escaner) {//llamarlo asi String miTexto = Utiles.escanerTexto();lo mismo con la de abajo
        System.out.println("Escribe un texto:");
        String texto=escaner.nextLine();
        return texto;
    }

    public static int escanerNumero(Scanner escaner){//si salta error puede ser por que ultimo sea true antes de tiempo
        
       
        while(true){//aunque sea raro sirve para que la unica forma de salir sea con un return y asi java no de error
            try {
                int numero = Integer.parseInt(escaner.nextLine());
                return numero; 
            } catch (NumberFormatException e) {
                System.out.println("Debes de poner un numero.");
            }
        }
    }
     public static void LeerArchivo(Path ruta){//posiblemente se deba de cambiar
         try(BufferedReader entrada=Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){
                String lineas;
                 while ((lineas=entrada.readLine())!=null){
                     System.out.println(lineas);
                 }
             }catch(IOException e){
                 System.err.println("No se pudo leer el archivo");
             }
     }
}
