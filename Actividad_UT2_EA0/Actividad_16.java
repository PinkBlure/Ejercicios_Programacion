import java.util.Scanner;

public class Actividad_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Dame otro numero: ");
        int num2 = scan.nextInt();
        if (num1 == num2) System.out.println("Son iguales");
        else System.out.println("No son iguales");
        scan.close();
    }
}
