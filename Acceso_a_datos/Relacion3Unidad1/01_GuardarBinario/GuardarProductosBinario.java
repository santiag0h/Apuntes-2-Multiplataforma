import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class GuardarProductosBinario {

    public static void main(String[] args) {
        Path ruta = Path.of("Acceso_a_datos","Relacion3Unidad1","01_GuardadBinario","datos", "productos.dat");
        List<Producto> productos = new ArrayList<>();
                productos.add(new Producto(1, "Teclado", 59.90, 8));
                productos.add(new Producto(2, "Ratón", 24.50, 15));
                productos.add(new Producto(3, "Monitor", 219.00, 4));
                productos.add(new Producto(4, "Memoria USB", 14.95, 30));
            try{
                Files.createDirectories(ruta.getParent());
                try (ObjectOutputStream salida =new ObjectOutputStream(Files.newOutputStream(ruta))){
                    salida.writeObject(productos);
                }if(Files.exists(ruta)&&Files.size(ruta)>0){
                    System.out.println("Guardados " + productos.size() + " productos en " + ruta);
                    System.out.println("Tamaño: " + Files.size(ruta) + " bytes");
                }
            }catch(IOException e){
                System.err.println("Error al guardar productos: " + e.getMessage());
            }
        // TODO 1: crear una lista con al menos cuatro Producto.
        // TODO 2: crear la carpeta datos si hace falta.
        // TODO 3: guardar la lista completa con ObjectOutputStream.
        // TODO 4: controlar IOException.
        
    }
}