package EV_3_Ejercicios_POO.Entidades;

public class Tiempo {

    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo(int hora, int minutos, int segundos) {

        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public Tiempo(){}

    // setters
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int hora) {
        this.hora = hora;
    }

    public void setSegundos(int hora) {
        this.hora = hora;
    }

    // Getters
    public int getHora(){
        return hora;
    }

    public int getMinutos(){
        return minutos;
    }

    public int getSegundos(){
        return segundos;
    }
    
}
