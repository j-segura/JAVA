package Raices;

import Raices.Servicios.RaizServicio;

public class RaicesMain {
    
    public static void main(String[] args) {

        RaizServicio ecuacion = new RaizServicio();
        ecuacion.cargarEcuacion();
        ecuacion.MostrarEcuacion();
        System.out.println("discriminante: " + ecuacion.getDiscriminante());
        System.out.println("Tiene raices: " + ecuacion.tieneRaices());
        System.out.println("Tiene raiz: " + ecuacion.tieneRaiz());
        ecuacion.calcularSoluciones();

    }


}
