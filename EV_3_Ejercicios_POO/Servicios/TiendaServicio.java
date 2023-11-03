package EV_3_Ejercicios_POO.Servicios;

import java.util.Scanner;

import EV_3_Ejercicios_POO.Entidades.Movil;

public class TiendaServicio {

    Scanner scanner = new Scanner(System.in);
    
    public Movil cargarCelular() {

        System.out.println("Ingrese los datos del celular:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Memoria RAM: ");
        int memoriaRam = scanner.nextInt();
        System.out.print("Almacenamiento: ");
        int almacenamiento = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        int[] codigo = ingresarCodigo();

        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, codigo);
    }

    public int[] ingresarCodigo() {

        int[] codigo = new int[7];

        System.out.println("Ingrese el código del celular (7 números):");
        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }

        return codigo;
    }

}
