import java.util.Scanner;

public class Archivo_de_aprendizaje {
    public static void main(String[] args) {
        Scanner escaner =new Scanner(System.in);
        System.out.println("Escribe un texto:");
        String texto=escaner.nextLine();
        System.out.println("Escribe un numero");
        //int numero=escaner.nextInt();//se puede hacer asi pero puede dar errores muy facilmente hacerlo de la manera de abajo
        int numero= Integer.parseInt(escaner.nextLine());
        System.out.println("tu id es:"+texto+"Y tu numero es:"+numero);
        escaner.close();
    }
}
