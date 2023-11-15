import java.util.Scanner;

public class Actividad_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num % 3 == 0) System.out.println("Es múltiplo de 3");
        if (num % 5 == 0) System.out.println("Es múltiplo de 5");
        scan.close();
    }
}
