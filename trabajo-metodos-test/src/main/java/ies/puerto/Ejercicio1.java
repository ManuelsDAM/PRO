package ies.puerto;

/**
 * Clase que tiene como objetivo realizar
 * @author Manuels
 */
public class Ejercicio1 {
    public static void main(String[] args) {


    }


    /**
     * Función que calcula el factorial de un numero
     * @param numero de entrada para el calculo
     * @return resultado del factorial
     */
    public int calcularFactorial(int numero) {
        int resultado = 1;
        for(int i = 2; i <= numero; i++){
            resultado = resultado*i;

        }
        return resultado;
    }

}