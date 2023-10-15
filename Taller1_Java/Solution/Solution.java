package Taller1_Java.Solution;

import java.util.Scanner;

public class Solution {

    static Scanner capture;

    Solution() {
        capture = new Scanner(System.in);
    }

    /*
     * 1. Suponga que un individuo desea invertir su capital en un banco y desea
     * saber cuanto dinero ganara
     * Después de un mes si el banco paga a razón de 2% mensual.
     */
    void calculateMonthlyGain() {
        System.out.print("Ingrese capital a invertir: ");
        double capital = capture.nextDouble();
        System.out.print("Ingrese razón mesual (porcentaje): ");
        double porcentage = capture.nextDouble();
        System.out.println("Usted ganara: " + capital * (porcentage / 100));
    }

    /*
     * 2. Un vendedor recibe al final del mes un salario básico junto con la
     * comisión de sus ventas que será el 10% del total de las ventas, el vendedor
     * desea
     * Saber cuanto dinero obtendrá por concepto de comisiones por las tres ventas
     * que realiza en el mes y el
     * Total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
     */
    void calculateCommissions() {
        System.out.println("Ingrese salario basico: ");
        double basicSalary = capture.nextDouble();
        System.out.println("Ingrese el valor total de sus ventas: ");
        double totalSales = capture.nextDouble();
        double finalSalary = basicSalary + (totalSales * 0.1);
        System.out.println("Usted obtendra: " + finalSalary);
    }

    /*
     * 3) Una tienda ofrece un descuento del 15% sobre el total de la compra y un
     * cliente desea saber cuanto
     * Deberá pagar finalmente por su compra.
     */
    void calculateDiscount(double discount) {
        System.out.println("Ingrese valor total compra: ");
        double totalSale = capture.nextDouble();
        double totalToPayWithDiscount = totalSale - (totalSale * (discount / 100));
        System.out.println("Total a pagar con descuento: " + totalToPayWithDiscount);
    }

    /*
     * 4) Un aprendiz desea saber cual será su calificación final en la materia de
     * Algoritmos. Dicha calificación se
     * Compone de los siguientes porcentajes:
     *
     * 55% del promedio de sus tres calificaciones parciales.
     * 30% de la calificación del examen final.
     * 15% de la calificación de un trabajo final.
     *
     */
    void finalRating() {
        System.out.println("EMPEZEMOS CON LAS CALIFICACIONES PARCIALES: ");
        System.out.println("Nota 1: ");
        double note1 = capture.nextDouble();
        System.out.println("Nota 2: ");
        double note2 = capture.nextDouble();
        System.out.println("Nota 3: ");
        double note3 = capture.nextDouble();
        System.out.println("EXELENTE!, cuanto saco en el examen final: ");
        double finalExam = capture.nextDouble();
        System.out.println("FINALMENTE!, nota del trabajo final: ");
        double finalWork = capture.nextDouble();

        /* sacamos el promedi de las notas parciales */
        double prom = (note1 + note2 + note3) / 3;

        double finalRating = (prom * 0.55) + (finalExam * 0.3) + (finalWork * 0.15);

        System.out.println("La calificion final es de: " + finalRating);
    }

    /*
     *
     * 5) Un maestro desea saber que porcentaje de hombres y que porcentaje de
     * mujeres hay en un grupo de Estudiantes
     *
     * Ejemplo para sacar el porcentaje de hombres.
     *
     * Porcentaje_Hombresh = Numero_Hombres * 100 / Total_de_Personas
     */

    void calculateGenderPercentage() {
        System.out.println("CALCULAR PORCENTAJE DE HOMBRES Y MUJERES");
        System.out.print("total de estudiantes en el grupo: ");
        int totalPeople = capture.nextInt();
        System.out.print("total de hombres en el grupo: ");
        int men = capture.nextInt();
        int women = totalPeople - men;

        double menPorcentage = men * 100 / totalPeople;
        double womenPorcentage = women * 100 / totalPeople;

        System.out.println("Hombres: " + menPorcentage);
        System.out.println("Mujeres: " + womenPorcentage);
    }

    /* 6) Realizar un algoritmo que calcule la edad de una persona. */
    void calculateAge() {
        System.out.println("Hola!, cuantos años tienes: ");
        int age = capture.nextInt();
        System.out.println("Parse no me la va creer!, un pajarito me conto que usted tiene " + age + " años");
    }

    /*
     * 7) Dada una cantidad en dólares, obtener la equivalencia en pesos, asumiendo
     * que un dólar equivale a 1500$
     */
    void conversionPesosToDollars(double dollarPrice) {
        System.out.println("CONVERSION DE PESOS A DOLARES");
        System.out.print("Pesos: ");
        double pesos = capture.nextDouble();
        double dollar = pesos / dollarPrice;
        System.out.print("Dolares: " + dollar);
    }

    /*
     * 8) Leer un número y mostrar la multiplicación del 1 hasta el 10 ejemplo si
     * digita el 2 multiplicar 2*1-2*2-2*3-2*4-2*5 y así sucesivamente hasta el 10.
     */
    void multiplicationTables() {
        System.out.println("TABLAS DE MULTIPLICAR");
        System.out.print("la tabla del (ingrese el numero): ");
        int i = 1;
        int num = capture.nextInt();

        while (i < 11) {
            int result = num * i;
            System.out.println(num + " por " + i + " = " + result);
            i++;
        }
    }

    /*
     * 9) Dada La presión, el volumen y la temperatura de una masa de aire se
     * relacionan por la formula:
     * Masa = (presión * volumen) / (0.37 * (temperatura + 460))
     * Mostrar el resultado de esta operación con los datos ingresados.
     */
    void calculateMass() {
        System.out.print("presion: ");
        double presion = capture.nextDouble();
        System.out.print("volumen: ");
        double volumen = capture.nextDouble();
        System.out.print("temperatura: ");
        double temp = capture.nextDouble();

        double result = (presion * volumen) / (0.37 * (temp + 460));
        System.out.print("la masa del objeto es de: " + result);
    }

    /*
     * 10) Calcular el número de pulsaciones que una persona debe tener por cada 10
     * segundos de ejercicio, si la
     * Formula es:
     * número_de_Pulsaciones = (220 - edad)/10 Mostrar el numero de pulsaciones que
     * debe de tener según el dato ingresado.
     */
    void calculateNumberOfPulsesPerMinute() {
        System.out.print("¿Cual es tu edad?: ");
        double age = capture.nextDouble();
        double numberOfPulses = (200 - age) / 10;
        System.out.print("El numero de pulsaciones que debe de tener según el dato ingresado son de " + numberOfPulses
                + " pulasaciones cada 10s");
    }

    /*
     * 11) Calcular el nuevo salario de un obrero si obtuvo un incremento del 25%
     * sobre su salario anterior.
     */
    void calculateIncrementOfSalary(double increment) {
        System.out.print("¿Cual es tu salario actual?: ");
        double salary = capture.nextDouble();
        double result = salary + (salary * (increment / 100));
        System.out.print("su salario se ha incrementado un " + increment + "% ahora es de " + result);
    }

    /*
     * 12) En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología.
     * El presupuesto anual del hospital se reparte conforme a la siguiente tabla:
     *
     * Área Porcentaje del presupuesto
     *
     * Ginecología 40%
     * Traumatología 30%
     * Pediatría 30%
     *
     * Obtener la cantidad de dinero que recibirá cada área, para cualquier monto
     * presupuestal.
     */
    void calculateBudgetPerArea() {
        System.out.print("¿Cual es el presupuesto?: ");
        double budgetTotal = capture.nextDouble();
        System.out.println("Ginecología: " + (budgetTotal * 0.4));
        System.out.println("Traumatología: " + (budgetTotal * 0.3));
        System.out.println("Pediatría: " + (budgetTotal * 0.3));
    }

    /*
     * 13) El dueño de una tienda compra un artículo a un precio determinado.
     * Obtener
     * el precio en que lo debe vender para obtener una ganancia del 30%.
     */
    void howMuchToGainAProfit() {
        System.out.print("Precio del articulo: ");
        double itemPrice = capture.nextDouble();
        System.out.print("¿Cuanto le quieres ganar?(porcentaje): ");
        double porcentage = capture.nextDouble();
        double result = itemPrice + (itemPrice * (porcentage / 100));
        System.out
                .println("Para obtener una ganancia del " + porcentage + "% usted debe bender el articulo a " + result);
    }

    /*
     * 14) Todos los lunes, miércoles y viernes, una persona corre la misma ruta y
     * cronometra los tiempos obtenidos. Determinar el tiempo promedio que la
     * persona tarda en recorrer la ruta en una semana
     */

    void calculateAverageTimeOfTheRoute() {

    }

    /*
     * 15) Tres personas deciden invertir su dinero para fundar una empresa. Cada una
     * de ellas invierte una cantidad distinta. Obtener el porcentaje que cada quien
     * invierte con respecto a la cantidad total invertida.
     */

    void calculatePercentageInvested() {
        System.out.print("cuanto invirtio la primera persona: ");
        double person1 = capture.nextDouble();
        System.out.print("cuanto invirtio la segunda persona: ");
        double person2 = capture.nextDouble();
        System.out.print("cuanto invirtio la tercera persona: ");
        double person3 = capture.nextDouble();
        double toalInvested = person1 + person2 + person3;
        double person1PercentageInvested = person1 * 100 / toalInvested;
        double person2PercentageInvested = person2 * 100 / toalInvested;
        double person3PercentageInvested = person3 * 100 / toalInvested;
        System.out.println("persona1" +person1PercentageInvested);
        System.out.println("persona1" +person2PercentageInvested);
        System.out.println("persona1" +person3PercentageInvested);
    }

    /* 16) Un aprendiz desea saber cual será su promedio general en las tres materias mas difíciles que el cursa y cual será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se muestra a continuación:

    La calificación de Matemáticas se obtiene de la sig. Manera:

    Examen 90%
    Promedio de tareas 10%
    En esta materia se pidió un total de tres tareas.

    La calificación de Física se obtiene de la sig. Manera:

    Examen 80%
    Promedio de tareas 20%
    En esta materia se pidió un total de dos tareas.

    La calificación de Química se obtiene de la sig. Manera:

    Examen 85%
    Promedio de tareas 15%
    En esta materia se pidió un promedio de tres tareas. */



    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.calculatePercentageInvested();
    }

}
