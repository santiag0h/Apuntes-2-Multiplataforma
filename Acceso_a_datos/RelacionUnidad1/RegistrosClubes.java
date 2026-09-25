package RelacionUnidad1;

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
            Scanner escaner = new Scanner(System.in);// crear el escaner
            System.out.println("Escribe una id:");
            int id = Integer.parseInt(escaner.nextLine());
            System.out.println("Escribe una equipo:");
            String equipo = escaner.nextLine();
            System.out.println("Escribe una ciudad:");
            String ciudad = escaner.nextLine();

            try (BufferedWriter salida = Files.newBufferedWriter(ruta, StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                salida.write(id + ";" + equipo + ";" + ciudad + ";");// escribir el txt
                salida.newLine();
            } catch (IOException e) {
                System.err.println("No se pudo leer la carpeta:" + e.getMessage());
            }
            escaner.close();
        }
    }
}
