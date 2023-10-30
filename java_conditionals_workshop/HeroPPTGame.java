package java_conditionals_workshop;

import java.util.Scanner;
import java.util.Random;


public class HeroPPTGame {

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        Random random = new Random();

        String[] heroes = {"Superman", "Batman", "Flash"};

        // Accede al elemento aleatorio en el array
        String randomHero = heroes[random.nextInt(heroes.length)];

        System.out.println(randomHero);

        System.out.println("BIENVENIDO A SUPERMAN, BATMAN, FLASH (Piedra papel o tijera pero de heroes)");

        System.out.println("Elije una opcion( Superman, Batman o Flash ):");
        String heroSelected = capture.nextLine();
        System.out.println("Tu oponente ah elegido: " + randomHero);

        if (heroSelected.equals(randomHero)) {
            System.out.println("La partida es un empate");
        } else {
            switch (heroSelected) {
                case "Superman":
                    if (randomHero.equals("Batman") || randomHero.equals("Flash")) {
                        System.out.println("Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
                case "Batman":
                    if (randomHero.equals("Flash")) {
                        System.out.println("Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
                case "Flash":
                    if (randomHero.equals("Superman")) {
                        System.out.println("Ganaste!");
                    } else {
                        System.out.println("Tu oponente gana");
                    }
                    break;
                default:
                    System.out.println("A vo te dejaron caer de chiquito verdad?");
            }
        }

        capture.close();

    }
    
}
