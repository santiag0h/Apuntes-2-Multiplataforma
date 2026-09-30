package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class alumnos {
    //     Crea un programa que busque un alumno concreto dentro de alumnos.csv a partir de un ID introducido
    // por teclado.
    // Lee todas las líneas del fichero en UTF-8.
    // Recorre solo los registros de datos y compara el ID solicitado con el primer campo.
    // Si lo encuentras, muestra nombre y grupo; si no existe, muestra un mensaje específico.
    // El programa debe distinguir entre un ID introducido que no sea numérico y un ID numérico que
    // simplemente no exista.
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","alumnos.csv");
        try{
            List <String> archivo =Files.readAllLines(ruta,StandardCharsets.UTF_8);
            int Id = Utiles.escanerNumero();
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
