package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Catálogo_de_videojuegos {
    public static void main(String[] args) {
        Path archivo=Path.of("Acceso_a_datos","Relacion2Unidad1","videojuegos.csv");
        try{
            if(Files.notExists(archivo)){
                System.out.println("No existe el archivo de videojuegos");
                return;
            }
            List<String> primera =Files.readAllLines(//metemos las lineas del archivo en un array list 
                archivo,StandardCharsets.UTF_8);
                int contador=0;
                for(int i =1; i<primera.size();i+=1){//iniciamos en 1 para evitar la primera linea
                    String linea = primera.get(i);
                    String[] hola=linea.split(";",-1);
                    if(hola.length!=3){//comprobamos que el archivo tenga 3 campos
                        System.out.println("EL formato del archivo esta mal");
                        return;
                    }
                    for (String parte:hola){//mostramos esto ya con un nuevo formato
                        if(contador==0){
                            Integer.parseInt(parte);
                            System.out.print("["+parte+"]");
                            contador+=1;
                        }else if(contador==1){
                            System.out.print(parte);
                            contador+=1;
                        }else if(contador==2){
                            System.out.println("- "+parte);
                            contador=0;
                        }
                    }
                }
        }catch(IOException e){
            System.err.println("No se pudo modificar:"+e.getMessage());
        }
    }
}
