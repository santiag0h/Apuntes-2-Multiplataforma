package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","inventario.csv");
        Path ruta2=Path.of("Acceso_a_datos","Relacion2Unidad1","inventario.bak");
        if (!Files.exists(ruta)) {
            System.out.println("No existe el archivo: " + ruta);
            return;
        }else if(!Files.isRegularFile(ruta)){
            System.out.println("el tipo de archivo no es correcto: " + ruta);
            return;
        }
        if (!Files.exists(ruta2)) {
            System.out.println("No existe el archivo: " + ruta2);
            return;
        }else if(!Files.isRegularFile(ruta2)){
            System.out.println("el tipo de archivo no es correcto: " + ruta2);
            return;
        }

        try{
            List<String> archivo=Files.readAllLines(ruta,StandardCharsets.UTF_8);
            Scanner escaner =new Scanner(System.in);
            System.out.println("Introduce un id: ");
            int id=Utiles.escanerNumero(escaner);
            System.out.println("Introduce la stock: ");
            int stock=Utiles.escanerNumero(escaner);
            List<String> nuevas =new ArrayList<>();
            nuevas.add("id;nombre;stock");
            boolean existe=false;
            boolean esValido=true;  
            String confirmacion="null";
            System.out.println("Quieres copiar restaurar el archivo original?,Escribe S o N ");
            while(!confirmacion.equals("s")&&!confirmacion.equals("n")){
                confirmacion=Utiles.escanerTexto(escaner).toLowerCase();
                if(!confirmacion.equals("s")&&!confirmacion.equals("n")){
                    System.out.println("Debes escribir S o N ");
                }
            }
            
            if(confirmacion.equals("n")){
            Files.copy(ruta, ruta2, StandardCopyOption.REPLACE_EXISTING);
                 
            for(int i=1;i<archivo.size()&&esValido==true;i+=1){
                String linea=archivo.get(i);
                String[] partes=linea.split(";",-1);
                int id2=Integer.parseInt(partes[0]);
                if(partes.length!=3){
                    System.out.print("arhcivo incorrecto");
                    esValido=false;
                }
                if(id==id2){
                    nuevas.add(partes[0]+";"+partes[1]+";"+stock);
                    Files.write(ruta,nuevas,StandardCharsets.UTF_8);
                    existe=true;
                }else{
                    nuevas.add(linea);
                    Files.write(ruta,nuevas,StandardCharsets.UTF_8);
                }
                
            }
            
            if(existe==false&&esValido==true){
                    System.out.println("El id introducido no existe");
                }
            }else{
                Files.copy(ruta2, ruta, StandardCopyOption.REPLACE_EXISTING);
            }
            
                 
            escaner.close();
            
            
        }catch(IOException e){
            System.err.println("Ha ocurrido un error" +e);
        }catch(NumberFormatException e){
             System.err.println("Un tipo de dato es incorrecto");
        }
        
    }
}
