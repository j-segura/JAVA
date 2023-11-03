package EV_3_Ejercicios_POO.Entidades;

public class Triangulo {

    private double lado;
    private double base;

    public Triangulo(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}
