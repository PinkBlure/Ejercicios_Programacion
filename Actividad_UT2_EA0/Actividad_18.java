import java.util.Scanner;

public class Actividad_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num > 15 && num < 20) System.out.println("Está entre 14 y 20");
        else System.out.println("No está entre 14 y 20");
        scan.close();
    }
}
