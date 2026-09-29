package Relacion1Unidad1;

import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class RegistrosClubes {
    public static void main(String[] args) {
        Path ruta = Path.of("datos","clubes.txt");// tengo que comprobar la carpeta mas tarde
        if (Files.exists(ruta)) {
            int id =0;
            Scanner escaner = new Scanner(System.in);// crear el escaner
            while(id!=-1){
                System.out.println("Escribe una id:");
                id = Integer.parseInt(escaner.nextLine());
                if(id!=-1){
                    System.out.println("Escribe una equipo:");
                    String equipo = escaner.nextLine();
                    System.out.println("Escribe una ciudad:");
                    String ciudad = escaner.nextLine();

                    try (BufferedWriter salida = Files.newBufferedWriter(ruta, StandardCharsets.UTF_8,//Aqui esta el writer
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                        salida.write(id + ";" + equipo + ";" + ciudad + ";");// escribir en el txt
                        salida.newLine();
                    } catch (IOException e) {
                        System.err.println("No se pudo escribir en el archivo:" + e.getMessage());
                    }
                }
            }
            try(BufferedReader entrada=Files.newBufferedReader(ruta, StandardCharsets.UTF_8)){//Aqui esta el reader
                String lineas;
                while ((lineas=entrada.readLine())!=null){//vemos si las lineas si esta en blanco paramos de leer
                    System.out.println(lineas);
                }
            }catch(IOException e){
                System.err.println("No se pudo leer el archivo");
            }
            escaner.close();//cerramos el escaner
        }
    }
}
