package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean numeroPrimo(int numero){
            if(numero <= 1) {
                return false;
            }

           for (int i = 2 ; i <= numero/2 ; i++) {
               return true;
           }
        return false;
    }

}

