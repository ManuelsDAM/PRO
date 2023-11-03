package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void promedioArrayTest(){
        float[] varArray = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float resultado = ejercicio2.promedio(varArray);
        Assertions.assertEquals(3.5, resultado, "No se ha obtenido el resultado esperado");
    }
}
