import java.util.Scanner;

public class Actividad_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = scan.nextInt();
        if (num > 0) System.out.println("Es positivo");
        else if (num == 0) System.out.println("Es 0");
        else System.out.println("Es negativo");
        scan.close();
    }
}
