package Actividades_Clase;

import java.util.Scanner;

public class Actividad_2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] arrayEnteros = new int[5];
        for (int i = 0; i<5; i++) {
            System.out.print("Dame un numero: ");
            arrayEnteros[i] = scan.nextInt();
        }

        int[] arrayReverso = new int[5];
        int j = 0;
        for (int i=4; i>=0; i--) {
            arrayReverso[j++] = arrayEnteros[i];
        }

        for (int i: arrayReverso) {
            System.out.println(i);
        }

        scan.close();
    }

}
