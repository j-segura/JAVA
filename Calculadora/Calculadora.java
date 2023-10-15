package Calculadora;

import java.util.Scanner;

public class Calculadora {

    double num1;
    double num2;

    void Calculadora() {

    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    void subtract(double a, double b) {
        System.out.println(a - b);
    }

    void multiply(double a, double b) {
        System.out.println(a * b);
    }

    void divide(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Que quieres hacer?: ");
        System.out.println("1. Sumar, 2. restar, 3, multiplicar, 4. dividir");
        int operator = scanner.nextInt();

        switch (operator) {
            case 1:
                calculadora.add(num1, num2);
                break;
            case 2:
                calculadora.subtract(num1, num2);
                break;
            case 3:
                calculadora.multiply(num1, num2);
                break;
            case 4:
                calculadora.divide(num1, num2);
                break;
            default:
                System.out.println("Te dejaron caer de pequeño verdad? -_-");
        }
    }
}
