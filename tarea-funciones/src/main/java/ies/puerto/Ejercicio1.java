package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Funcion que calcula el area
     * @param base del triangulo
     * @param altura del triangulo
     * @return resultad, el area del triangulo
     */
    public int areaTriangulo(int base, int altura) {
        int resultado = 0;
        resultado = (base*altura)/2;
        return resultado;
    }

}