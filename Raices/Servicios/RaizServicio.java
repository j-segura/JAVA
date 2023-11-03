package Raices.Servicios;

import java.util.Scanner;

import Raices.Entidades.Raiz;

public class RaizServicio {

    Scanner scanner = new Scanner(System.in);
    Raiz ecuacion = new Raiz();
    public double discriminante = 0;

    public RaizServicio() {
    }

    public void cargarEcuacion() {

        System.out.println("Ecuaciónes cuadráticas");
        System.out.println("Creemos la ecuacion:");
        System.out.print("a: ");
        ecuacion.setA(scanner.nextDouble());
        System.out.print("b: ");
        ecuacion.setB(scanner.nextDouble());
        System.out.print("c: ");
        ecuacion.setC(scanner.nextDouble());

        this.discriminante = Math.pow(ecuacion.getB(), 2) - 4 * ecuacion.getA() * ecuacion.getC();

    }

    public void MostrarEcuacion() {

        System.out.println(
                "Ecuacion: " + ecuacion.getA() + "x^2 + " + ecuacion.getB() + "x + " + ecuacion.getC() + " = 0");

    }

    public double getDiscriminante() {

        return this.discriminante;

    }

    /*
     * Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
     * para
     * que esto ocurra, el discriminante debe ser mayor o igual que 0.
     */
    public boolean tieneRaices() {

        boolean result = this.discriminante > 0 ? true : false;
        return result;

    }

    /* Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
    que esto ocurra, el discriminante debe ser igual que 0. */
    public boolean tieneRaiz() {

        boolean result = this.discriminante == 0 ? true : false;
        return result;

    }

    /* Este metodo contiene la solucion a los puntos: obtenerRaices(), obtenerRaiz(), calcular() en una sola funcion:  */
    public void calcularSoluciones() {

        double a = ecuacion.getA();
        double b = ecuacion.getB();

        if (tieneRaices()) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Posibles soluciones");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (tieneRaiz()) {

            System.out.println("Posible solucion");
            double x = -b / (2 * a);
            System.out.println("x = " + x);
            
        } else {

            System.out.println("No hay posibles soluciones");

        }

    }

}
