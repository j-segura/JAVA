package EV_3_Ejercicios_POO.Entidades;

public class Fraccion {

    private int numeradorFrac1;
    private int denominadorFrac1;
    private int numeradorFrac2;
    private int denominadorFrac2;

    public Fraccion(int numeradorFrac1, int denominadorFrac1, int numeradorFrac2, int denominadorFrac2){
        this.numeradorFrac1 = numeradorFrac1;
        this.denominadorFrac1 = denominadorFrac1;
        this.numeradorFrac2 = numeradorFrac2;
        this.denominadorFrac2 = denominadorFrac2;
    }

    public Fraccion(){};

    // Setters
    public void setNumeradorFrac1(int numeradorFrac1) {
        this.numeradorFrac1 = numeradorFrac1;
    }

    public void setDenominadorFrac1(int denominadorFrac1) {
        this.denominadorFrac1 = denominadorFrac1;
    }

    public void setNumeradorFrac2(int numeradorFrac2) {
        this.numeradorFrac2 = numeradorFrac2;
    }

    public void setDenominadorFrac2(int denominadorFrac2) {
        this.denominadorFrac2 = denominadorFrac2;
    }

    //Getters
    public int getNumeradorFrac1() {
        return numeradorFrac1;
    }

    public int getDenominadorFrac1() {
        return denominadorFrac1;
    }

    public int getNumeradorFrac2() {
        return numeradorFrac2;
    }

    public int getDenominadorFrac2() {
        return denominadorFrac2;
    }
    
}
