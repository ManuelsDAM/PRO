package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public int mayor(int[] array){
        int numeroMayor = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] > numeroMayor ){
                numeroMayor = array[i];
            }
        }
        return numeroMayor;
    }

    public int menor(int[] array){
        int numeroMenor = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < numeroMenor ){
                numeroMenor = array[i];
            }
        }
        return numeroMenor;
    }
}