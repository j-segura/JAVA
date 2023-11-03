package EV_3_Ejercicios_POO.Entidades;

public class Auto {
    
    private String nombreDueño;
    private String fechaVencimientoCarnet;
    private String color;
    private String modelo;
    private int kmMotor;

    public Auto(String nombreDueño, String fechaVencimientoCarnet, String color, String modelo) {
        this.nombreDueño = nombreDueño;
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
        this.color = color;
        this.modelo = modelo;
        this.kmMotor = 7500; // Valor inicial por defecto
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getFechaVencimientoCarnet() {
        return fechaVencimientoCarnet;
    }

    public void setFechaVencimientoCarnet(String fechaVencimientoCarnet) {
        this.fechaVencimientoCarnet = fechaVencimientoCarnet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKmMotor() {
        return kmMotor;
    }

    public void setKmMotor(int kmMotor) {
        this.kmMotor = kmMotor;
    }

}
