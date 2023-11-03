package EV_3_Ejercicios_POO.Servicios;

import java.util.Scanner;

import EV_3_Ejercicios_POO.Entidades.Tiempo;

public class TiempoServicio {
    
    Tiempo tiempo = new Tiempo();
    Scanner scanner = new Scanner(System.in);

    public void setTiempo(int hora, int minutos, int segundos) {

        // validaciones
        if (hora > -1 && hora < 24) {

            tiempo.setHora(hora);

        } else {

            System.out.println("Hora invalida!");

        }

        if (minutos > -1 && minutos < 60) {

            tiempo.setMinutos(minutos);

        } else {

            System.out.println("Minutos invalida!");

        }

        if (segundos > -1 && segundos < 60) {

            tiempo.setSegundos(segundos);

        } else {

            System.out.println("Segundos invalida!");

        }

    }

}
