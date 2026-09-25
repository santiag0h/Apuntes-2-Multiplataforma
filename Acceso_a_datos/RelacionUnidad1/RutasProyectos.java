package Acceso_a_datos.RelacionUnidad1;


import java.nio.file.Path;
public class RutasProyectos {
    public static void main(String[] args) {
        Path ruta = Path.of("datos");
        Path subruta1 = ruta.resolve("copias");
        Path subruta2 = ruta.resolve("clubes.txt");
        //rutas absolutas
        System.out.println("Absoluta:");
        System.out.println(ruta.toAbsolutePath());
        System.out.println(subruta1.toAbsolutePath());
        System.out.println(subruta2.toAbsolutePath());
        //rutas relativas
        System.out.println("Relativa:");
        System.out.println(ruta);
        System.out.println(subruta1);
        System.out.println(subruta2);
    }
}
