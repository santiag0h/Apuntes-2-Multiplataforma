package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class alumnos {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","alumnos.csv");
        try{
            List <String> archivo =Files.readAllLines(ruta,StandardCharsets.UTF_8);
            int Id = Utiles.escanerNumero(true);
            boolean comprobar=false;
            for(int i =1; i<archivo.size();i+=1){//iniciamos en 1 para evitar la primera linea
                    String linea = archivo.get(i);      
                    String[] hola=linea.split(";",-1);
                    int nuevo=Integer.parseInt(hola[0]);
                    if(nuevo==Id){
                        System.out.println(linea);
                        comprobar=true;
                    }
            }  
            if(comprobar==false){
                        System.out.println("El id introducido no existe");
                    }
        }catch(IOException e){
            System.err.println("Ha ocurrido un fallo en el archivo "+e);
        }
    }
}
