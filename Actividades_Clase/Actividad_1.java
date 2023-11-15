package Actividades_Clase;

public class Actividad_1 {
    
    public static void main(String[] args) {
        
        int[] arrayEnteros = new int[10];

        for (int i = 0; i<10; i++) {
            arrayEnteros[i] = (int)(Math.random() * 10);
        }

        int counter = 0;

        for (int i = 0; i<5; i++) {
            if (arrayEnteros[i] % 2 == 0) counter++;
        }

        System.out.println("Hay " + counter + " numeros pares");

    }

}
