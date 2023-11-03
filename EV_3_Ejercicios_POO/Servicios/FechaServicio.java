package EV_3_Ejercicios_POO.Servicios;

import EV_3_Ejercicios_POO.Entidades.Fecha;

public class FechaServicio {
    
    private Fecha fecha;

    public FechaServicio() {

        fecha = new Fecha();

    }

    public void verificarAnio(int anioUsuario) {

        if (anioUsuario >= 1900 && anioUsuario <= 2021) {
            fecha.setAnio(anioUsuario);
        } else {
            fecha.setAnio(1900);
        }

    }

    public int obtenerDiasDelMes(int mesUsuario) {

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mesUsuario >= 1 && mesUsuario <= 12) {
            if (mesUsuario == 2 && fecha.esAnioBisiesto()) {
                return 29;
            } else {
                return diasPorMes[mesUsuario];
            }
        } else {
            return -1; // Valor no válido
        }

    }

    public void diaAnterior() {

        int dia = fecha.getDia();
        int mes = fecha.getMes();
        int anio = fecha.getAnio();

        if (dia > 1) {
            fecha.setDia(dia - 1);
        } else {
            if (mes > 1) {
                fecha.setMes(mes - 1);
                fecha.setDia(obtenerDiasDelMes(mes - 1));
            } else {
                fecha.setMes(12);
                fecha.setDia(obtenerDiasDelMes(12));
                fecha.setAnio(anio - 1);
            }
        }

    }

    public void diaSiguiente() {

        int dia = fecha.getDia();
        int mes = fecha.getMes();
        int anio = fecha.getAnio();

        int diasDelMes = obtenerDiasDelMes(mes);

        if (dia < diasDelMes) {
            fecha.setDia(dia + 1);
        } else {
            if (mes < 12) {
                fecha.setMes(mes + 1);
                fecha.setDia(1);
            } else {
                fecha.setMes(1);
                fecha.setDia(1);
                fecha.setAnio(anio + 1);
            }
        }

    }

    public String getFecha(){

        int dia = fecha.getDia();
        int mes = fecha.getMes();
        int anio = fecha.getAnio();

        return  dia + "/" + mes + "/" + anio; 

    }

}
