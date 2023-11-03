package EV_3_Ejercicios_POO.Entidades;

public class Pass {
    
    private String pass;
    private String nombre;
    private int dni;

    public Pass(int dni, String nombre, String pass) {

        this.dni = dni;
        this.nombre = nombre;
        this.pass = pass;

    }

    // getters
    public int getDni() {
        return dni;
    }

    public String getPass() {
        return pass;
    }
    
    public String getNombre() {
        return nombre;
    }

    // setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }

}
