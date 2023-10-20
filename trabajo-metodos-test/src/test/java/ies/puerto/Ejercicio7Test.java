package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void calcularDiaSemanaOK() {
        verificarDiaSemana("Lunes", 1);
        verificarDiaSemana("Martes", 2);
        verificarDiaSemana("Miércoles", 3);
        verificarDiaSemana("Jueves", 4);
        verificarDiaSemana("Viernes", 5);
        verificarDiaSemana("Sábado", 6);
        verificarDiaSemana("Domingo", 7);
        verificarDiaSemana("No es un día de la semana", !(1..7));
    }

    public void verificarDiaSemana(String strDia, int numeroDia) {
        String resultado = "";

        resultado = ejercicio7.calcularDiaSemana(numeroDia);
        Assertions.assertEquals(strDia, resultado, "No se ha obtenido el resultado esperado");

    }
}

    /**   Toda esta parte hace el código de test muy largo, de la manera en la que está arriba los comprueba facilmente
     * @Test
    public void calcularMiercolesTestOK() {
        String resultado = "";
        String resultadoOK = "Miércoles";

        resultado = ejercicio7.calcularDiaSemana(3);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void calcularJuevesTestOK() {
        String resultado = "";
        String resultadoOK = "Jueves";

        resultado = ejercicio7.calcularDiaSemana(4);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void calcularViernesTestOK() {
        String resultado = "";
        String resultadoOK = "Viernes";

        resultado = ejercicio7.calcularDiaSemana(5);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void calcularSabadoTestOK() {
        String resultado = "";
        String resultadoOK = "Sábado";

        resultado = ejercicio7.calcularDiaSemana(6);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void calcularDomingoTestOK() {
        String resultado = "";
        String resultadoOK = "Domingo";

        resultado = ejercicio7.calcularDiaSemana(7);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void calcularOtroTestOK() {
        String resultado = "";
        String resultadoOK = "No es un día de la semana";

        resultado = ejercicio7.calcularDiaSemana(54);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }
    @Test
    public void verificarDiaSemana(String strDia, int numeroDia) {
        String resultado = "";
        resultado = ejercicio7.calcularDiaSemana(numeroDia);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");

    }*/

