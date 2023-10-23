package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int areaCuadrado(int a) {
        return areaRectangulo(a,a);
    }

    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = a * b;
        return resultado;
    }
}