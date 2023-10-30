package java_conditionals_workshop;

import java.util.Scanner;

public class BarbieTheSortingDoctor {

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);

        System.out.println("Bienvenido a la Clínica de Barbie, la doctora clasificadora.");
        System.out.println("Vamos a clasificar a los pacientes según su edad, temperatura y nivel de dolor.");

        System.out.print("¿Cual es tu edad?: ");
        int age = capture.nextInt();

        System.out.println("¿Cual es tu temperatura en grados celsius");
        double temp = capture.nextDouble();

        System.out.println("¿Cual es tu nivel de dolor?");
        int pain = capture.nextInt();

        // clasificacion segun edad
        String AgeCategory = "";
        if (age >= 0 && age <= 1) {
            AgeCategory = "bebé";
        } else if (age >= 2 && age <= 10) {
            AgeCategory = "niño";
        } else if (age >= 11 && age <= 18) {
            AgeCategory = "adolescente";
        } else if (age >= 19 && age <= 65) {
            AgeCategory = "adulto";
        } else {
            AgeCategory = "adulto mayor";
        }

        // clasificacion segun temperatura
        String tempCategory = "";
        if (temp < 35.5) {
            tempCategory = "hipotermia";
        } else if (temp >= 35.5 && temp <= 37.5) {
            tempCategory = "temperatura normal";
        } else {
            tempCategory = "fiebre";
        }

        // clasificacion segun dolor
        String painCategory = "";
        String recomendation = "";
        if (pain >= 8) {
            painCategory = "dolor intenso";
            recomendation = "Barbie debe administrar un analgésico.";
        } else if (pain >= 5 && pain <= 7) {
            painCategory = "dolor moderado";
            recomendation = "Barbie debe recomendar reposo y analgésicos.";
        } else {
            painCategory = "dolor leve";
            recomendation = "Barbie asegura que el paciente se recuperará pronto.";
        }

        // resultados
        System.out.println("\nResultados de la clasificación:");
        System.out.println("Edad del paciente: " + age + " años (" + AgeCategory + ")");
        System.out.println("Temperatura del paciente: " + temp + "°C (" + tempCategory + ")");
        System.out.println("Nivel de dolor del paciente: " + pain + " (" + painCategory + ")");
        System.out.println(recomendation);

        capture.close();

    }

}
