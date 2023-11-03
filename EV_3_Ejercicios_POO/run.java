package EV_3_Ejercicios_POO;

import EV_3_Ejercicios_POO.Servicios.ServicioFraccion;
import EV_3_Ejercicios_POO.Servicios.TiempoServicio;
import EV_3_Ejercicios_POO.Servicios.TiendaServicio;
import EV_3_Ejercicios_POO.Servicios.TrianguloServicio;
import EV_3_Ejercicios_POO.Entidades.Auto;
import EV_3_Ejercicios_POO.Entidades.Movil;
import EV_3_Ejercicios_POO.Entidades.Triangulo;
import EV_3_Ejercicios_POO.Servicios.AutoServicio;
import EV_3_Ejercicios_POO.Servicios.FechaServicio;
import EV_3_Ejercicios_POO.Servicios.PassServicio;
import EV_3_Ejercicios_POO.Servicios.RaizServicio;

public class run {

    public static void main(String[] args) {

        // Ejercicio 1
        /* ServicioFraccion fracciones = new ServicioFraccion();
        fracciones.cargFracciones();
        fracciones.calculadora(); */


        // Ejercicio 2
        /* TiempoServicio tiempo = new TiempoServicio();
        tiempo.setTiempo(8, 23, 4);
        tiempo.setTiempo(25, 0, 0); */

        // Ejercicio 3
        /* PassServicio pass = new PassServicio();
        pass.correrPrograma(); */

        // Ejercicio 4
        /* FechaServicio fechaServicio = new FechaServicio();
        fechaServicio.verificarAnio(2023); // Cambio el año a uno no válido
        System.out.println("Fecha: " + fechaServicio.getFecha());
        fechaServicio.verificarAnio(2020); // Cambio el año a uno válido
        System.out.println("Fecha: " + fechaServicio.getFecha());
        System.out.println("Días en el mes 2 (febrero): " + fechaServicio.obtenerDiasDelMes(2));
        fechaServicio.diaAnterior();
        System.out.println("Día anterior: " + fechaServicio.getFecha());
        fechaServicio.diaSiguiente();
        System.out.println("Día siguiente: " + fechaServicio.getFecha()); */

        // Ejercicio 5
        /* Triangulo[] triangulos = new Triangulo[4];
        triangulos[0] = new Triangulo(5, 6);
        triangulos[1] = new Triangulo(4, 8);
        triangulos[2] = new Triangulo(7, 10);
        triangulos[3] = new Triangulo(6, 12);

        TrianguloServicio servicio = new TrianguloServicio();
        Triangulo trianguloMayorArea = servicio.encontrarTrianguloConMayorArea(triangulos);

        System.out.println("Triángulo con el área más grande:");
        System.out.println("Lado: " + trianguloMayorArea.getLado());
        System.out.println("Base: " + trianguloMayorArea.getBase());
        System.out.println("Área: " + servicio.calcularArea(trianguloMayorArea));
        System.out.println("Perímetro: " + servicio.calcularPerimetro(trianguloMayorArea)); */

        // Ejecicio 6 se encuentra en ./SopaDeLetras

        // Ejercicio 7
        /* Auto auto = new Auto("Dueño1", "2025-12-31", "Rojo", "Sedan");
        AutoServicio servicio = new AutoServicio();

        System.out.println("Información del auto:");
        System.out.println("Dueño: " + auto.getNombreDueño());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Kilómetros en el motor: " + auto.getKmMotor());

        servicio.cargarFichaAuto(auto, "Azul", "Deportivo", 8000, "Dueño2");

        System.out.println("\nInformación del auto después de cargar la ficha:");
        System.out.println("Dueño: " + auto.getNombreDueño());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Kilómetros en el motor: " + auto.getKmMotor());

        servicio.modificarTitularidad(auto, "Dueño3");

        System.out.println("\nInformación del auto después de modificar la titularidad:");
        System.out.println("Dueño: " + auto.getNombreDueño());

        servicio.indicarTrayectoRecorrido(auto, 500);

        System.out.println("\nInformación del auto después de un trayecto recorrido:");
        System.out.println("Kilómetros en el motor: " + auto.getKmMotor());

        boolean necesitaService = servicio.necesidadService(auto);
        System.out.println("\n¿Necesita service? " + (necesitaService ? "Sí" : "No")); */


        // Ejercicio 8: solo era crar la clase cancion en las entidades con sus getters y setters

        // Ejerciio 9
        /* RaizServicio ecuacion = new RaizServicio();
        ecuacion.cargarEcuacion();
        ecuacion.MostrarEcuacion();
        System.out.println("discriminante: " + ecuacion.getDiscriminante());
        System.out.println("Tiene raices: " + ecuacion.tieneRaices());
        System.out.println("Tiene raiz: " + ecuacion.tieneRaiz());
        ecuacion.calcularSoluciones(); */

        // Ejercicio 10
        TiendaServicio tiendaServicio = new TiendaServicio();

        Movil celular = tiendaServicio.cargarCelular();

        System.out.println("\nInformación del celular ingresado:");
        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Precio: " + celular.getPrecio());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Memoria RAM: " + celular.getMemoriaRam());
        System.out.println("Almacenamiento: " + celular.getAlmacenamiento());
        System.out.print("Código: ");
        int[] codigo = celular.getCodigo();
        for (int i = 0; i < codigo.length; i++) {
            System.out.print(codigo[i]);
        }

    }
    
}
