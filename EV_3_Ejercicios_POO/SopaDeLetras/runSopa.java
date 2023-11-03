package EV_3_Ejercicios_POO.SopaDeLetras;

import EV_3_Ejercicios_POO.SopaDeLetras.Servicios.SopaDeLetrasServicio;

public class runSopa {

    public static void main(String[] args) {

        SopaDeLetrasServicio sopaDeLetras = new SopaDeLetrasServicio();
        sopaDeLetras.mostrarSopaDeLetras();
        sopaDeLetras.remplazarPalabra("ACTOR", "hola");
        sopaDeLetras.mostrarSopaDeLetras();
        sopaDeLetras.mostrarSopaDeLetrasInvertida();

        int[] posicion = sopaDeLetras.buscarPalabra("HoLA");
        System.out.println(
                "La palabra 'HOLA' se encuentra en la posición: fila " + posicion[0] + " columna: " + posicion[1]);

    }

}
