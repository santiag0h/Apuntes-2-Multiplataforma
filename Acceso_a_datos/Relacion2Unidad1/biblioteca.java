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
        Path ruta = Path.of("Acceso_a_datos", "Relacion2Unidad1", "biblioteca.csv");
        if (!Files.exists(ruta)) {
            System.out.println("El archivo no existe: " + ruta);
            return;
        } else if (!Files.isRegularFile(ruta)) {
            System.out.println("El tipo de archivo no es correcto: " + ruta);
        }
        try {
            List<String> biblioteca = Files.readAllLines(ruta, StandardCharsets.UTF_8);// cojo los datos para añadirselo
                                                                                       // mas tarde
            Scanner escaner = new Scanner(System.in);
            List<String> archivo = Files.readAllLines(ruta, StandardCharsets.UTF_8);
            List<Integer> idRegistrado = new ArrayList<>();// creamos una lista con las id
            List<String> nombreRegistrado = new ArrayList<>();// creamos una lista con los nombres
            List<String> autorRegistrados = new ArrayList<>();
            for (int i = 1; i < archivo.size(); i += 1) {
                String linea = archivo.get(i);
                String partes[] = linea.split(";", -1);

                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                idRegistrado.add(id);
                nombreRegistrado.add(nombre.toLowerCase());
                autorRegistrados.add(partes[2]);
            }
            // hacerlo con do while para que le pida todo el rato el titulo o id hasta que
            // este bien
            boolean idCorrecto = false;
            int id;
            do {
                System.out.println("Escribe una id:");
                id = Utiles.escanerNumero(escaner);
                if (id <= 0) {
                    System.out.println("La id tiene que ser mayor que 0");
                    continue;
                }
                if (idRegistrado.contains(id)) {
                    System.out.println("La id ya existe");
                    continue;
                }
                idCorrecto = true;
            } while (!idCorrecto);
            boolean tituloCorrecto = false;
            String titulo;
            do {
                System.out.println("Escribe un titulo:");
                titulo = Utiles.escanerTexto(escaner);
                if (titulo.isBlank()) {// is blank comprueba si solo hay espacios
                    System.out.println("El titulo esta vacio");
                    continue;
                }
                if (nombreRegistrado.contains(titulo.trim().toLowerCase())) {
                    System.out.println("El titulo ya existe");
                    continue;
                }
                tituloCorrecto = true;
            } while (!tituloCorrecto);
            boolean autorCorrecto = false;
            String autor;
            do {
                System.out.println("Escribe un autor:");
                autor = Utiles.escanerTexto(escaner);
                if (autor.isBlank()) {// is blank comprueba si solo hay espacios
                    System.out.println("El autor esta vacio");
                    continue;
                }

                autorCorrecto = true;
            } while (!autorCorrecto);
            String lineanueva = id + ";" + titulo + ";" + autor;
            biblioteca.add(lineanueva);
            Files.write(ruta, biblioteca, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Ha ocurrido un errror:" + e.getMessage());
        }
    }
}
