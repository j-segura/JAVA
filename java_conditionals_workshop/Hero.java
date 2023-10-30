package java_conditionals_workshop;

import java.util.Scanner;
import java.time.Year;

public class Hero {

    static Scanner capture;

    Hero() {
        capture = new Scanner(System.in);
    }

    void favoritePower() {

        System.out.print("Como te llamas?: ");
        String name = capture.nextLine();
        System.out.println("Cual es tu poder favorito? ");
        System.out.println("1. volar, 2. super fuerza, 3. invisibilidad");
        System.out.print("numero de opcion: ");
        int power = capture.nextInt();

        switch (power) {
            case 1:
                System.out.println("¡" + name + " eres como Superman!");
                break;
            case 2:
                System.out.println("¡" + name + " eres como Hulk!");
                break;
            case 3:
                System.out.println("¡" + name + " eres como la mujer invisible!");
                break;
            default:
                System.out.println("¡Poder no valido!");
        }

    }

    void strengthLevel() {
        System.out.print("Como te llamas?: ");
        String name = capture.nextLine();
        System.out.print("Cual es tu nivel de fuerza: ");
        int strength = capture.nextInt();

        String resultado = (strength > 99) ? "¡" + name + " eres un superhéroe!" : "Necesitas más entrenamiento";

        System.out.println(resultado);
    }

    void heroAge() {

        System.out.print("Ingrese año de nacimiento: ");
        int yearOfBirth = capture.nextInt();

        Year year = Year.now();
        int currentYear = year.getValue();

        int age = currentYear - yearOfBirth;

        String resultado = (age < 18) ? "Eres un joven superhéroe" : "Eres un experimentado superhéroe";

        System.out.println(resultado);
    }

    void heroBattle() {

        System.out.println("BIENVENIDO A LA BATALLA!");
        System.out.print("Cual es el nivel de fuerza del heroe 1: ");
        int powerHero1 = capture.nextInt();
        System.out.print("Cual es el nivel de fuerza del heroe 2: ");
        int powerHero2 = capture.nextInt();

        String resultado = (powerHero1 > powerHero2) ? "El heroe 1 ha ganado" : "El heroe 2 ha ganado";
        System.out.println(resultado);

    }

    void canFly() {

        System.out.print("¿Puede tu superhéroe volar? (true/false): ");
        boolean canFly = capture.nextBoolean();

        String resultado = (canFly) ? "¡Eres increíblemente rápido en el aire!" : "Necesitas entrenar más para volar";
        System.out.println(resultado);

    }

    void SuperheroEnemiesProgram() {

        System.out.print("Ingresa el número de enemigos derrotados: ");
        int enemiesDefeated = capture.nextInt();

        String resultado = (enemiesDefeated > 10) ? "Eres un superhéroe valiente." : "Sigue luchando contra el crimen.";
        System.out.println(resultado);

    }

    void SuperheroLeagueProgram() {
        System.out.print("¿Tu superhéroe es parte de una liga? (true/false): ");
        boolean isPartOfLeague = capture.nextBoolean();

        String result = (isPartOfLeague) ? "Eres un superhéroe de élite." : "Debes considerar unirte a una liga.";
        System.out.println(result);
    }

    void SuperheroSpecialAbilityProgram() {
        System.out.print("Ingresa el nombre de tu superhéroe: ");
        String heroName = capture.nextLine();

        System.out.print("Ingresa la habilidad especial de tu superhéroe: ");
        String specialAbility = capture.nextLine();

        System.out.println("Superhéroe: " + heroName);
        System.out.println("Habilidad Especial: " + specialAbility);
    }

    public static void main(String[] args) {

        Hero solution = new Hero();
        solution.SuperheroSpecialAbilityProgram();

    }

}
