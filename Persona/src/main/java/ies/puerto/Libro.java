package ies.puerto;

public class Libro {
    private String titulo;

    private String autor;

    private int anioPublicacion;

    public Libro(){}

    /**
     * Constructor de la clase con todos sus parametros
     * @param titulo del libro
     * @param autor del libro
     * @param anioPublicacion del libro
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String imprimir(){
        "Titulo: "+titulo+", autor: "+autor+", año:"+anioPublicacion;
    }
}
