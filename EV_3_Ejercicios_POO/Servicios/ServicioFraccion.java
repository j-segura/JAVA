package EV_3_Ejercicios_POO.Servicios;

import java.util.Arrays;
import java.util.Scanner;

import EV_3_Ejercicios_POO.Entidades.Fraccion;

public class ServicioFraccion {

    private boolean funccionesCargadas = false;

    public ServicioFraccion() {
    }

    Scanner scanner = new Scanner(System.in);
    Fraccion fraccion = new Fraccion();

    public int[] partearFraccion(String entrada) {

        String[] partes = entrada.split("/");

        if (partes.length == 2) {

            try {
                int numerador = Integer.parseInt(partes[0]);
                int denominador = Integer.parseInt(partes[1]);

                if (denominador != 0) {

                    int[] fraccionPartida = {numerador, denominador};
                    return fraccionPartida;
                    
                } else {

                    System.out.println("El denominador no puede ser cero.");
                    int[] errorArray = { Integer.MIN_VALUE, Integer.MIN_VALUE };
                    return errorArray;

                }
            } catch (NumberFormatException e) {

                System.out.println("El denominador no puede ser cero.");
                int[] errorArray = { Integer.MIN_VALUE, Integer.MIN_VALUE };
                return errorArray;

            }
    
        } else {

            System.out.println("Entrada no válida. Asegúrate de incluir un denominador con '/' en el formato adecuado.");
            int[] errorArray = { Integer.MIN_VALUE, Integer.MIN_VALUE };
            return errorArray;

        }

    }

    public static boolean isInvalidIntArray(int[] arr) {

        for (int value : arr) {
            if (value == Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;

    }    

    public Fraccion cargFracciones() {

        System.out.println("_FRACCIONES_");
        System.out.print("Ingrese la primera fraccion (a/b): ");
        String fraccion1 = scanner.nextLine();
        int[] fraccion1Partida = partearFraccion(fraccion1);
        System.out.print("Ingrese la segunda fraccion (a/b): ");
        String fraccion2 = scanner.nextLine();
        int[] fraccion2Partida = partearFraccion(fraccion2);

        if (!isInvalidIntArray(fraccion1Partida) || !isInvalidIntArray(fraccion1Partida)) {

            fraccion.setNumeradorFrac1(fraccion1Partida[0]);
            fraccion.setDenominadorFrac1(fraccion1Partida[1]);
            fraccion.setNumeradorFrac2(fraccion2Partida[0]);
            fraccion.setDenominadorFrac2(fraccion2Partida[1]);

            this.funccionesCargadas = true;
            System.out.println("Funcciones cargadas correctamente!");

        } else {

            System.out.println("Error: Alguno o ambos valores son invalidos.");

        }

        return null;

    }

    // Función para encontrar el MCM de dos números
    public static int encontrarMCM(int a, int b) {
        return (a * b) / encontrarGCD(a, b);
    }

    // Función para encontrar el máximo común divisor (GCD) de dos números
    public static int encontrarGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return encontrarGCD(b, a % b);
    }

    public void sumarORestar(boolean esSuma){

        // Encontrar el mínimo común múltiplo de los denominadores
        int mcm = encontrarMCM(fraccion.getDenominadorFrac1(), fraccion.getDenominadorFrac2());

        // Expresar ambas fracciones con el mismo denominador (mcm)
        int nuevoNumerador1 = fraccion.getNumeradorFrac1() * (mcm / fraccion.getDenominadorFrac1());
        int nuevoNumerador2 = fraccion.getNumeradorFrac2() * (mcm / fraccion.getDenominadorFrac2());

        // Sumar o restar las fracciones con el mismo denominador
        int sumaNumerador = esSuma ? nuevoNumerador1 + nuevoNumerador2 : nuevoNumerador1 - nuevoNumerador2;

        // Simplificar la fracción si es posible
        int gcd = encontrarGCD(sumaNumerador, mcm);
        int resultadoNumerador = sumaNumerador / gcd;
        int resultadoDenominador = mcm / gcd;

        // Mostrar el resultado
        System.out.println("La suma de las fracciones es: " + resultadoNumerador + "/" + resultadoDenominador);
        
    }

    public void multiplicar(){

        int nuevoNumerador1 = fraccion.getNumeradorFrac1() * fraccion.getNumeradorFrac2();
        int nuevoDenominador1 = fraccion.getDenominadorFrac1() * fraccion.getDenominadorFrac2();

        int gcd = encontrarGCD(nuevoNumerador1, nuevoDenominador1);

        int resultadoNumerador = nuevoNumerador1 / gcd;
        int resultadoDenominador = nuevoDenominador1 / gcd;

        System.out.println("La multiplicación de las fracciones es: " + resultadoNumerador + "/" + resultadoDenominador);

    }

    public void dividir(){

        int nuevoNumerador1 = fraccion.getNumeradorFrac1() * fraccion.getDenominadorFrac2();
        int nuevoDenominador1 = fraccion.getDenominadorFrac1() * fraccion.getNumeradorFrac2();
    
        int gcd = encontrarGCD(nuevoNumerador1, nuevoDenominador1);
    
        int resultadoNumerador = nuevoNumerador1 / gcd;
        int resultadoDenominador = nuevoDenominador1 / gcd;
    
        System.out.println("La división de las fracciones es: " + resultadoNumerador + "/" + resultadoDenominador);

    }

    public void calculadora(){

        boolean salir = false;

        if (this.funccionesCargadas) {

            System.out.println("¿Que deseas hacer?");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            System.out.print("Ingrese la opcion: ");
            int opcion  = scanner.nextInt();

            switch (opcion) {
                case 1:
                    sumarORestar(true);
                    break;
                case 2:
                    sumarORestar(false);
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida -_-");
            }

            if(!salir){
                this.calculadora();
            }

        } else {

            System.out.println("Lo siento no hay funcciones cargadas vulve a intentar");

        }
        

    }

}
