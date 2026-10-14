package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biblioteca {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","biblioteca.csv");
        if(!Files.exists(ruta)){
            System.out.println("El archivo no existe: "+ ruta);
            return;
        }else if(!Files.isRegularFile(ruta)){
            System.out.println("El tipo de archivo no es correcto: "+ruta);
        }
        try{
            Scanner escaner=new Scanner(System.in);
            List<String> archivo=Files.readAllLines(ruta,StandardCharsets.UTF_8);
            List<String> idRegistrado=new ArrayList<>();//creamos una lista con las id
            List<String> nombreRegistrado=new ArrayList<>();//creamos una lista con los nombres
            for (int i=1;i<archivo.size();i+=1){
                String linea =archivo.get(i);
                String partes[]=linea.split(";",-1);
                String id=partes[0];
                String nombre=partes[1];
                idRegistrado.add(id);
                nombreRegistrado.add(nombre);
            }
            //hacerlo con do while para que le pida todo el rato el titulo o id hasta que este bien
            do{
                int id=Utiles.escanerNumero(escaner);
                if(id<=0){

                }
            }while(idRegistrado.contains());
        }catch(IOException e){
            System.err.println("Ha ocurrido un errror:"+e.getMessage());
        }
    }
}
