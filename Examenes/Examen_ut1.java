import java.util.Scanner;

public class Examen_ut1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("<---- ADIVINA EL NUMERO ---->");

        System.out.print("\nJUGADOR 1 - Introduce el número a adivinar: ");
        int numAdivinar = scan.nextInt();
        int intento = 1;

        while ((numAdivinar < 1 || numAdivinar > 50)) {
            if (intento <= 1) {
                System.out.print("\nEl número no es válido, dame un valor entre 1 y 50: ");
                numAdivinar = scan.nextInt();
                intento++;
            } else {
                System.out.println("\nEl número no es válido, no se puede jugar.");
                intento = 0;
                break;
            }
        }

        if (intento != 0) {
            System.out.print("\nJUGADOR 1 - Indica el número de intentos del jugador 2: ");
            intento = scan.nextInt();

            System.out.println("El jugador 2 tiene " + intento + " intentos.");

            int prueba;
            while (intento != 0) {
                System.out.print("\nJUGADOR 2 - Adivina el numero: ");
                prueba = scan.nextInt();

                if (prueba == numAdivinar) {
                    System.out.println("\nJUGADOR 2 - ¡Has acertado!");
                    break;
                } else {
                    System.out.println("\nJUGADOR 2 - No has acertado");
                    if (prueba > numAdivinar) {
                        System.out.println("PISTA - El número es menor al introducido");
                    } else {
                        System.out.println("PISTA - El número es mayor al introducido");
                    }
                }
                intento--;
            }

            if (intento == 0) {
                System.out.println("\nNo quedan intentos. Fin del juego.");
            }
        }
    }
}