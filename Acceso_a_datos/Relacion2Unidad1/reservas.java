package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Relacion1Unidad1.Utiles;

public class reservas {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","reservas.csv");
        if (!Files.exists(ruta)) {
            System.out.println("No existe el archivo: " + ruta);
            return;
        }else if(!Files.isRegularFile(ruta)){
            System.out.println("el tipo de archivo no es correcto: " + ruta);
            return;
        }
        try{
        System.out.print("Escribe la id que desea cancelar:");
        Scanner escaner=new Scanner(System.in);
        int id=Utiles.escanerNumero();
        boolean esValido=true;
        List<String> archivo=Files.readAllLines(ruta,StandardCharsets.UTF_8);
        boolean existe=false;
        List<String> nuevas =new ArrayList<>();
        nuevas.add("id;nombre;stock");
        for(int i=1;i<archivo.size()&&esValido==true;i+=1){
                String linea=archivo.get(i);
                String[] partes=linea.split(";",-1);
                int id2=Integer.parseInt(partes[0]);
                if(partes.length!=3){
                    System.out.print("arhcivo incorrecto");
                    esValido=false;
                }
                if(id==id2){
                    existe=true;
                }else{
                    nuevas.add(linea);
                    
                }
            }
            if(existe==true){
                System.out.println("La id ha sido borrada correctamente");
                Files.write(ruta,nuevas,StandardCharsets.UTF_8);
            }else{
                System.out.println("La id no ha sido encontrada");
            }
        escaner.close();
        }catch(IOException e){
            System.err.println("Ha ocurrido un error "+e);
        }





        
    }
}
