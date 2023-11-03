package EV_3_Ejercicios_POO.Entidades;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 1900;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean esAnioBisiesto() {
        return (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
    }
    
}
