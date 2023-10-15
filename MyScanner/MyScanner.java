package MyScanner;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un texto
        System.out.print("Ingresa un texto: ");

        // Leer el texto ingresado por el usuario
        String textoIngresado = scanner.nextLine();

        // Mostrar el texto ingresado
        System.out.println("Texto ingresado: " + textoIngresado);

        // Cerrar el objeto Scanner cuando hayas terminado de usarlo
        scanner.close();
    }
}