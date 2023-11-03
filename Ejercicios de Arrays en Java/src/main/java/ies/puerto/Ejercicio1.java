package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }

    /**
     * Funcion que realiza la suma del array 1,2,3,4,5
     * @return suma de los elementos del array
     * @author Manuels
     */

    public int sumar(int [] array){

        int suma = 0;
        for(int i=0; i < array.length ;i++ ) {
            suma += array[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    return suma;
    }

}

