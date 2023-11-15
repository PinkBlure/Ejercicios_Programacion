import java.util.Scanner;

public class Actividad_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num % 2 == 0) System.out.println("Es par");
        else System.out.println("Es impar");
        scan.close();
    }
}
