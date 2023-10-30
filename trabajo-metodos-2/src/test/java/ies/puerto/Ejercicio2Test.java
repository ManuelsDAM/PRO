package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void numeropositivoOkTest() {
        boolean positivo = ejercicio2.numeropositivo(10);
        Assertions.assertEquals(true, positivo, "No se ha obtenido el resultado esperado");

    }

    @Test
    public void calcularSueldoHorasErrorTest() {
        boolean par = ejercicio2.numeropar(10);
        Assertions.assertEquals(true, par, "No debería resultar así");

    }
}
