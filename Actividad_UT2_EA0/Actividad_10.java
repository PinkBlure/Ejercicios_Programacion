import java.util.Scanner;

public class Actividad_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un lado del triángulo: ");
        int lado1 = scan.nextInt();
        System.out.print("Dame otro lado del triángulo: ");
        int lado2 = scan.nextInt();

        System.out.println("\nLa hipotenusa es: "
                            + Math.sqrt(Math.pow(lado1, 2) +
                                        Math.pow(lado2, 2)));

        scan.close();
    }
}
