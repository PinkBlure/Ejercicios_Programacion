import java.util.Scanner;

public class Actividad_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num % 10 == 0) System.out.println("Es múltiplo de 10");
        else System.out.println("No es múltiplo de 10");
        scan.close();
    }
}
