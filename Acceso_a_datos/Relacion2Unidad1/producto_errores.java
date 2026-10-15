package Relacion2Unidad1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class producto_errores {
    public static void main(String[] args) {
        Path ruta1 = Path.of("Acceso_a_datos", "Relacion2Unidad1", "productos_errores.csv");
        Path ruta2 = Path.of("Acceso_a_datos", "Relacion2Unidad1", "productos_validos.csv");
        if (!Files.exists(ruta1)) {
            System.out.println("El archivo no existe:" + ruta1);
        }
        if (!Files.exists(ruta2)) {
            System.out.println("El archivo no existe:" + ruta2);
        }
        if (!Files.isRegularFile(ruta1)) {
            System.out.println("El tipo de archivo no es correcto:" + ruta1);
        }
        if (!Files.isRegularFile(ruta2)) {
            System.out.println("El tipo de archivo no es correcto:" + ruta2);
        }
        try {
            List<String> productos = Files.readAllLines(ruta1);
            List<Integer> repetidos=new ArrayList<>();
            List<String> errores=new ArrayList<>();
            for (int i = 1; i < productos.size(); i += 1) {
                String linea = productos.get(i);
                String partes[] = linea.split(";", -1);
                int id
                try{
                    id = Integer.parseInt(partes[1]);
                }catch(NumberFormatException e){
                    System.out.println("No es un numero entero");
                }
                if(partes.length!=3){
                    System.out.println("La linea " + i + " tiene un error de insuficientes campos");
                    errores.add(linea);
                    continue;
                }
                
                if(id<0){
                    System.out.println("La linea " + i + " tiene un error de id negativa");
                    errores.add(linea);
                    continue;
                }
                if(repetidos.contains(id)){
                    System.out.println("La linea " + i + " tiene un error de id repetidos");
                    errores.add(linea);
                    continue;
                }else{
                    repetidos.add(id);
                }

                

            }
        } catch (IOException e) {
            System.err.println("Ha ocurrido un errror:" + e.getMessage());
        }

    }
}
