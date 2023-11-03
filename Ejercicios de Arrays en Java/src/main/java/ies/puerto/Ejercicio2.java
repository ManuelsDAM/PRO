package ies.puerto;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion que devuelve el valor del promedio del array
     * @return la media del array
     * @author Manuels
     */
    public float promedio(float[] array){
        float promedio = 0;
        float suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            promedio = suma/array.length;
        }
        return promedio;
    }
}