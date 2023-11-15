import java.util.Scanner;

public class Actividad_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Dame un número entero: ");
        int num = scan.nextInt();

        System.out.println("\nEl numero introducido es "
                            + num);
        System.out.println("El doble de "
                            + num
                            + " es "
                            + num*2);
        System.out.println("El triple de "
                            + num
                            + " es "
                            + num*3);

        scan.close();

    }
}
