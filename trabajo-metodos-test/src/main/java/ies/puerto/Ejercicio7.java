package ies.puerto;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo al ejercicio 7");
    }

    public String calcularDiaSemana(int dia){
        String resultado = "Fallo";

        switch(dia){

            case 1:
                resultado = "Lunes";
                break;
            case 2:
                resultado = "Martes";
                break;
            case 3:
                resultado = "Miércoles";
                break;
            case 4:
                resultado = "Jueves";
                break;
            case 5:
                resultado = "Viernes";
                break;
            case 6:
                resultado = "Sábado";
                break;

            case 7:
                resultado = "Domingo";
                break;

            default:
                resultado = "No es un día de la semana";
        }

        return resultado;
    }

}