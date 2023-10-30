package ies.puerto;

/**
 * Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
 * muestra la suma y los muestra en orden creciente y en orden decreciente.
 */
public class Ejercicio3 {

    public int sumanumeros(int valor1, int valor2){
        return valor1 + valor2;
    }

    public int sumanumeros(int valor1, int valor2, int valor3){
        int resultado = sumanumeros(valor1, valor2);
        return sumanumeros(resultado, valor3);
    }

    public int sumanumeros(int valor1, int valor2, int valor3, int valor4){
        int resultado = sumanumeros(valor1, valor2, valor3);
        return sumanumeros(resultado, valor4);
    }
    public int sumanumeros(int valor1, int valor2, int valor3, int valor4, int valor5){
        int resultado = sumanumeros(valor1, valor2, valor3, valor4);
        return sumanumeros(resultado, valor5);
    }

    /**
     * Funcion para calcular el mayor de dos números introducidos
     * @param valor1
     * @param valor2
     * @return el mayor de los dos números
     */
    public int mayor(int valor1,int valor2){
        int resultado = valor1;
        if(valor2 > valor1){
            resultado = valor2;
        }return resultado;
    }

    public int mayor(int valor1,int valor2, int valor3){
        int resultado = mayor(valor1, valor2);
        resultado = mayor(resultado, valor3);
        return mayor(resultado, valor3);
    }
    public int mayor(int valor1,int valor2, int valor3, int valor4){
        int resultado = mayor(valor1, valor2, valor3);
        return mayor(resultado, valor4);
    }
    public int daIgual(int valor1,int valor2, int valor3, int valor4, int valor5){
        int resultado = mayor(valor1, valor2, valor3, valor4);
        return mayor(resultado, valor5);
    }

    /**
     *
     * @param valor1
     * @param valor2
     * @return
     */
    public int menor(int valor1,int valor2){
        int resultado = valor1;
        if(valor2 < valor1){
            resultado = valor2;
        }return resultado;
    }

    public int menor(int valor1,int valor2, int valor3){
        int resultado = menor(valor1, valor2);
        return menor(resultado, valor3);
    }
    public int menor(int valor1,int valor2, int valor3, int valor4){
        int resultado = menor(valor1, valor2, valor3);
        return menor(resultado, valor4);
    }
    public int daIgual2(int valor1,int valor2, int valor3, int valor4, int valor5){
        int resultado = menor(valor1, valor2, valor3, valor4);
        return menor(resultado, valor5);
    }

    public int comparar(int valor1, int valor2){
        int valorMayor = mayor(valor1,valor2);
        int valor
    }

    public int comparar(int valor1, int valor2, int valor3){
        int valor
    }
}