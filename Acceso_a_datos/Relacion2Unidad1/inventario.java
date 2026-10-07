package Relacion2Unidad1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class inventario {
    public static void main(String[] args) {
        Path ruta=Path.of("Acceso_a_datos","Relacion2Unidad1","inventario.csv");
        if (!Files.exists(ruta)) {
            System.out.println("No existe el archivo: " + ruta);
            return;
        }
        try{
            List<String> archivo=Files.readAllLines(ruta,StandardCharsets.UTF_8);
            int id=Utiles.escanerNumero(false);
            int stock=Utiles.escanerNumero(true);
            List<String> nuevas =new ArrayList<>();
            nuevas.add("id;nombre;stock");
            boolean existe=false;
            boolean esValido=true;
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

        }catch(IOException e){
            System.err.println("Ha ocurrido un error" +e);
        }catch(NumberFormatException e){
             System.err.println("Un tipo de dato es incorrecto");
        }
    }
}
