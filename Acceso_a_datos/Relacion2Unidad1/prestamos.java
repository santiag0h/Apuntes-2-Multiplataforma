package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class prestamos {
    public static void main(String[] args) {
        
        System.out.println("================================");
        System.out.println("      GESTOR DE PRÉSTAMOS       ");
        System.out.println("================================");
        System.out.println("1. Alta de préstamo");
        System.out.println("2. Listar préstamos");
        System.out.println("3. Buscar préstamo por ID");
        System.out.println("4. Cambiar material de un préstamo");
        System.out.println("5. Baja de préstamo");
        System.out.println("6. Crear copia de seguridad");
        System.out.println("7. Restaurar copia de seguridad");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","prestamos.csv");
        if (!Files.exists(ruta)) {
            System.out.println("No existe el archivo: " + ruta);
            return;
        }else if(!Files.isRegularFile(ruta)){
            System.out.println("el tipo de archivo no es correcto: " + ruta);
            return;
        }
        
            Scanner escaner =new Scanner(System.in);
            int opcion=2;
            while(opcion!=0){
                opcion=Utiles.escanerNumero(escaner);
                if(opcion==1){
                }else if(opcion==2){
                    System.out.println("Escribe un numero del 0 al 7");
                }else if(opcion==3){
                    System.out.println("Escribe un numero del 0 al 7");
                }else if(opcion==4){
                    System.out.println("Escribe un numero del 0 al 7");
                }else if(opcion==5){
                    System.out.println("Escribe un numero del 0 al 7");
                }else if(opcion==6){
                    System.out.println("Escribe un numero del 0 al 7");
                }else if(opcion==7){
                    System.out.println("Escribe un numero del 0 al 7");
                }else{
                    System.out.println("Escribe un numero del 0 al 7");
                }
            }
            
            

        
        
    }
    
}
