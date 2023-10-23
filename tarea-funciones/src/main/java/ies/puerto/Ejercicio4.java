package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Hello world!sosio");
    }


        /**
         * Funcion que calcula el mayor de dos numeros
         * @param a es uno de los numeros a comparar
         * @param b otro numero a comparar
         * @return resultado  el numero mayor
         */
         public int maximoNumeros(int a , int b) {

            int resultado = a;
            if (resultado < b) {
                resultado = b;
            }
             return resultado;

        }
        public int maximoNumeros(int numero1, int numero2, int numero3){
             int maximo = maximoNumeros(numero1, numero2);
             return maximoNumeros(maximo, numero3);
        }
}

