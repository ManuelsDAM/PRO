package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSueldoHorasOkTest() {
        int resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado");

    }

    @Test
    public void calcularSueldoHorasErrorTest() {
        int resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(resultado, 100, "No debería resultar así");

    }
}
