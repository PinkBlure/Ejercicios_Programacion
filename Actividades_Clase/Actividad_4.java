package Actividades_Clase;

import java.util.Scanner;

public class Actividad_4 {
    
    public static void main(String[] args) {
        // Media de notas de cada evaluación
        // Alumno destacado de cada evaluación

        Scanner scan = new Scanner(System.in);

        String[] arrayAlumnos = {"Aileen", "Moises", "Denian", "Carolina",
                                 "Victoria"};
        double[][] arrayNotas = {
            {10, 5, 3},
            {5, 7, 3},
            {9.5, 9, 10},
            {7, 2, 9},
            {5, 6, 3}
        };

        for (int i=0; i<3; i++) {
            double nota_media = 0;
            for (int j=0; j<5; j++) {
                nota_media += arrayNotas[j][i];
            }
            System.out.println("La nota media de la evaluacion "
                                + (i+1)
                                + " es "
                                + nota_media/5);
        }

        for (int i=0; i<3; i++) {
            int max_pos = 0; 
            for (int j=0; j<5; j++) {
                if (arrayNotas[j][i] > arrayNotas[max_pos][i]) max_pos = j;
            }
            System.out.println("La persona con la nota más alta en la primera"
                            + " evaluación es " + arrayAlumnos[max_pos]);
        }

        scan.close();
    }
}
