import java.util.Scanner;

public class Actividad_20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num % 2 == 0) System.out.println("Es múltiplo de 2");
        if (num % 3 == 0) System.out.println("Es múltiplo de 3");
        scan.close();
    }
}
