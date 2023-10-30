package java_conditionals_workshop;

import java.util.Scanner;

public class RonaldoVsMessi {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al programa de clasificación de Ronaldo y Messi en Barcelona y Real Madrid.");
        System.out.println("Por favor, ingrese el nombre del jugador y el nombre del equipo.");

        System.out.print("Nombre del jugador (Ronaldo o Messi): ");
        String nombreJugador = scanner.nextLine().toLowerCase();

        System.out.print("Nombre del equipo (Barcelona o Real Madrid): ");
        String nombreEquipo = scanner.nextLine().toLowerCase();

        if (nombreJugador.equals("ronaldo") && nombreEquipo.equals("real madrid")) {
            System.out.println("Cristiano Ronaldo es una leyenda en el Real Madrid. Ganó muchos títulos.");
        } else if (nombreJugador.equals("messi") && nombreEquipo.equals("barcelona")) {
            System.out.println("¡Lionel Messi es un ídolo en el Barcelona! Es el mejor jugador de todos los tiempos.");
        } else if ((nombreJugador.equals("messi") && nombreEquipo.equals("real madrid")) || (nombreJugador.equals("ronaldo") && nombreEquipo.equals("barcelona"))) {
            System.out.println("El jugador ingresado no está en la lista del equipo seleccionado.");
        } else if (!(nombreEquipo.equals("barcelona") || nombreEquipo.equals("real madrid"))) {
            System.out.println("El equipo ingresado no es válido. Solo se permite Barcelona o Real Madrid.");
        } else {
            System.out.println("El jugador ingresado no está en la lista de Barcelona ni Real Madrid.");
        }

        System.out.println("Gracias por utilizar el programa de clasificación. ¡Hasta luego!");
        
        scanner.close();

    }

}
