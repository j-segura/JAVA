package EV_3_Ejercicios_POO.SopaDeLetras.Servicios;

import java.util.Arrays;
import java.util.Random;

import EV_3_Ejercicios_POO.SopaDeLetras.Entidades.SopaDeLetras;

public class SopaDeLetrasServicio {

    SopaDeLetras sopaDeLetras = new SopaDeLetras();

    public SopaDeLetrasServicio() {
    }

    public int[] buscarPalabra(String palabra) {

        int resultadoFila = -1;
        int resultadoColumna = -1;

        String[] palabras = sopaDeLetras.getPalabrasBase();
        palabra = palabra.toUpperCase();

        boolean palabraExiste = false;

        for (String item : palabras) {
            if (item.equals(palabra)) {
                palabraExiste = true;
                break; // Si la palabra se encuentra, puedes salir del bucle.
            }
        }

        if (palabraExiste) {

            char[][] matriz = sopaDeLetras.getMatriz();

            for (int fila = 0; fila < matriz.length; fila++) {
                String filaComoString = String.valueOf(matriz[fila]);

                if (filaComoString.contains(palabra)) {
                    resultadoFila = fila;
                    resultadoColumna = filaComoString.indexOf(palabra);
                }
            }

        }

        int[] filaColumna = { resultadoFila, resultadoColumna };

        return filaColumna;

    }

    public void remplazarPalabra(String palabraVieja, String palabraNueva) {

        char[][] matriz = sopaDeLetras.getMatriz();
        int[] posicion = buscarPalabra(palabraVieja);
        int fila = posicion[0];
        String[] palabras = sopaDeLetras.getPalabrasBase();
        palabraVieja = palabraVieja.toUpperCase();
        palabraNueva = palabraNueva.toUpperCase();
        String palabraActualizada = palabraNueva;

        boolean palabraExiste = false;

        for (String item : palabras) {
            if (item.equals(palabraVieja)) {
                palabraExiste = true;
                break; // Si la palabra se encuentra, puedes salir del bucle.
            }
        }

        if (palabraExiste) {

            String filaComoString = String.valueOf(matriz[fila]);

            if (filaComoString.contains(palabraVieja)) {
                if (palabraNueva.length() <= palabraVieja.length()) {

                    // Rellenar con letras aleatorias si la nueva palabra es más corta
                    int longitudDiferencia = palabraVieja.length() - palabraNueva.length();
                    Random random = new Random();

                    StringBuilder rellenoAleatorio = new StringBuilder();
                    for (int i = 0; i < longitudDiferencia; i++) {
                        char letraAleatoria = (char) ('A' + random.nextInt(26)); // Letra aleatoria de la 'a' a la 'z'
                        rellenoAleatorio.append(letraAleatoria);
                    }

                    palabraNueva = palabraNueva + rellenoAleatorio.toString();

                    filaComoString = filaComoString.replaceFirst(palabraVieja, palabraNueva);

                } else {

                    System.out.println(
                            "la palabra nueva a remplazar debe ser de la misma longitud o menor a la que deseas remplazar");

                }

            }

            char[] nuevaFila = filaComoString.toCharArray();

            matriz[fila] = nuevaFila;

            sopaDeLetras.setMatriz(matriz);

            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].equals(palabraVieja)) {
                    palabras[i] = palabraActualizada;
                    break; // Puedes salir del bucle si encontraste y reemplazaste la cadena.
                }
            }

            System.out.println("AVISO!: " + palabraVieja + " se ha remplazado por " + palabraActualizada);

            sopaDeLetras.setPalabrasBase(palabras);

            System.out.println("Nueva lista de palabras: ");
            for (String p : sopaDeLetras.getPalabrasBase()) {
                System.out.print(p + ", ");
            }
            System.out.println("");

        } else {

            System.out.println("la palabra que deseas remplazar no existe en la sopa de letras");

        }

    }

    public void mostrarSopaDeLetras() {

        System.out.println("---SOPA DE LETRAS---");

        char[][] matriz = sopaDeLetras.getMatriz();

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int col = 0; col < matriz[0].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();

        }

    }

    public void mostrarSopaDeLetrasInvertida() {

        System.out.println("---SOPA DE LETRAS INVERTIDA---");

        char[][] matriz = sopaDeLetras.getMatriz();

        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int col = 0; col < columnas; col++) {
            for (int fila = 0; fila < filas; fila++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

    }

}
