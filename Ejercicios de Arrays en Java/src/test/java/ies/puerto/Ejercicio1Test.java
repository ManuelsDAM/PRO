package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();
    @Test
    public void sumaArrayTest(){
        int[] varArray = {1,2,3,4,5};
        int resultado = ejercicio1.sumar( varArray );
        Assertions.assertEquals(15, resultado, "No se ha obtenido el resultado esperado");
    }
}
