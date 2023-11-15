import java.util.Scanner;

public class Actividad_17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num1 = scan.nextInt();
        System.out.print("Dame otro numero: ");
        int num2 = scan.nextInt();
        if (num1 > num2) System.out.println("El primer numero es mayor");
        else if (num2 > num1) System.out.println("El segundo numero es mayor");
        else System.out.println("Son iguales");
        scan.close();
    }
}
