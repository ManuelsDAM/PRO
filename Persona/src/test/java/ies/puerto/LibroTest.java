package ies.puerto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    String autor = "Mi autor";
    String titulo = "Mi titulo";
    int anioPublicacion = 2022;
    Libro libro;

@BeforeEach
public void beforeEach(){

}
@Test
    public void constructorTestOk() {
        Libro milibro = new Libro(titulo, autor, anioPublicacion);
    Assertions.assertEquals(titulo, libro.getTitulo(), "No se ha obtenido el resultado deseado");
    Assertions.assertEquals(autor, libro.getAutor(), "No se ha obtenido el resultado deseado");
    Assertions.assertEquals(anioPublicacion, libro.getAnioPublicacion(), "No se ha obtenido el resultado deseado");
    }

    @Test
    public void setTituloTestOk(){
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No se ha obtenido el resultado deseado");
    }

    @Test
    public void setAutorTestOk(){
        String miAutor = "Otro autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No se ha obtenido el resultado deseado");
    }

    @Test
    public void setAnioPublicacionTestOk(){
        int otroAnio = 2000;
        libro.setAnioPublicacion(otroAnio);
        Assertions.assertEquals(otroAnio, libro.getAnioPublicacion(), "No se ha obtenido el resultado deseado");
    }

    @Test
    public void imprimirTestOk(){
        String resultadoOk= "Titulo: "+titulo+", autor: "+autor+", año:"+anioPublicacion;
        Assertions.assertEquals(resultadoOk, libro.imprimir(), "No se ha obtenido el resultado deseado");
        return resultado;
    }
}
