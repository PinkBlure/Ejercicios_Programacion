import java.util.Scanner;

public class Actividad_11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Dame el radio de la esfera: ");
        int radio = scan.nextInt();

        System.out.println("\nEl volumen de la esfera es: "
                            + ((4 * Math.PI)/3 * Math.pow(radio, 3)));

        scan.close();

    }
}
