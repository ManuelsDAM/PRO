package ies.puerto;

public class Ejercicio2 {
/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo y si es par o impar.
 */
    public boolean numeropositivo(int numero) {
        boolean positivo = false;
        if (numero > 0) {
            positivo = true;

        }
        return positivo;
    }
    public boolean numeropar(int numero) {
        boolean par = false;
        if (numero % 2 == 0) {
            par = true;

        }
        return par;

    }
}