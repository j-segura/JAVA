package EV_3_Ejercicios_POO.Entidades;

public class Cancion {
    
    private String titulo;
    private String autor;

    public Cancion(String titulo, String autor){

        this.titulo = titulo;
        this.autor = autor;

    }

    public Cancion(){}

    // getters

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    // setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

}
