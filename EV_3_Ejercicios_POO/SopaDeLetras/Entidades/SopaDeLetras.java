package EV_3_Ejercicios_POO.SopaDeLetras.Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SopaDeLetras {

    private char[][] SopaDeLetras;
    private String[] palabrasBase = { "ACTOR", "BICHO", "CABRA", "DADOS", "ERROR" };

    /*
     * public SopaDeLetras(int filas, int columnas, String[] palabrasbase) {
     *
     * this.filas = filas;
     * this.columnas = columnas;
     * this.palabrasBase = palabrasbase;
     * this.SopaDeLetras = generarMatrizAleatoria(this.filas, this.columnas);
     *
     * }
     */

    public SopaDeLetras() {
        this.SopaDeLetras = generarMatrizAleatoria(10, 10);
        colocarPalabrasEnSopa();
    }

    public static char[][] generarMatrizAleatoria(int filas, int columnas) {
        char[][] matriz = new char[filas][columnas];
        Random rand = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                char caracterAleatorio = (char) (rand.nextInt(26) + 'A'); // Genera un carácter aleatorio en mayúscula
                                                                          // (A-Z)
                matriz[i][j] = caracterAleatorio;
            }
        }

        return matriz;

    }

    public void colocarPalabrasEnSopa() {

        System.out.println("colocando palabras...");

        String[] palabras = this.palabrasBase;

        Random rand = new Random();

        ArrayList<Integer> filasOcupadas = new ArrayList<>();

        for (String palabra : palabras) {

            boolean colocada = false;

            while (!colocada) {
                int fila = rand.nextInt(this.SopaDeLetras.length);
                int columna = rand.nextInt(this.SopaDeLetras[0].length);

                if (columna + palabra.length() <= this.SopaDeLetras[0].length) {
                    // Verifica si la fila está ocupada
                    boolean filaOcupada = filasOcupadas.contains(fila);

                    if (!filaOcupada) {
                        // Coloca la palabra
                        for (int i = 0; i < palabra.length(); i++) {
                            this.SopaDeLetras[fila][columna + i] = palabra.charAt(i);
                        }
                        colocada = true;
                        filasOcupadas.add(fila); // Marcar la fila como ocupada después de colocar la palabra.
                    }

                }
            }

        }

        System.out.println("palabras colocadas con exito...");

    }

    // getters

    public char[][] getMatriz() {
        return SopaDeLetras;
    }

    public String[] getPalabrasBase() {
        return palabrasBase;
    }

    // setter

    public void setMatriz(char[][] matriz) {
        this.SopaDeLetras = matriz;
    }

    public void setPalabrasBase(String[] palabras) {
        this.palabrasBase = palabras;
    }

}
