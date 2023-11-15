package Actividades_Clase;

import java.util.Scanner;

public class Actividad_3 {
    
    public static void main(String[] args) {
        // Media de notas
        // Alumno destacado
        Scanner scan = new Scanner(System.in);

        String[] arrayAlumnos = {"Aileen", "Moises", "Denian", "Carolina",
                                 "Victoria"};
        double[] arrayNotas = new double[5];

        for (int i=0; i<5; i++) {
            System.out.print("Dame la nota: ");
            arrayNotas[i] = scan.nextDouble();
        }

        double nota_media = 0;
        for (double i: arrayNotas) {
            nota_media += i;
        }
        System.out.println("La nota media es " + nota_media/5);

        int max_pos = 0; 
        for(int i=1; i<5; i++) {
            if (arrayNotas[i] > arrayNotas[max_pos]) max_pos = i;
        }
        System.out.println("La persona con la nota más alta es "
                            + arrayAlumnos[max_pos]);

        scan.close();
    }
}
