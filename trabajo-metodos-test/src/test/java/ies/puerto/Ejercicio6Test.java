package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    public Ejercicio6 ejercicio6;
    @BeforeEach
    public void before(){
        ejercicio6 = new Ejercicio6();
    }
    @Test
    public void verificarArmstrongOK() {
        int numero = 154;

        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertFalse(resultado, "El numero NO debe ser Armstrong");
    }
    @Test
    public void verificarArmstrongNoOK() {
        int numero = 153;

        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertTrue(resultado, "El numero SI debe ser Armstrong");
    }
    @Test
    public void verificarArmstrong1OK() {
        int numero = 1;

        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertTrue(resultado, "El numero SI debe ser Armstrong");
    }
}
