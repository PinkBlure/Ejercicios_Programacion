import java.util.Scanner;

public class Actividad_7 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Dame un número entero: ");
        int num1 = scan.nextInt();

        System.out.print("Dame otro número entero: ");
        int num2 = scan.nextInt();

        System.out.println("\nHa introducido los números "
                            + num1
                            + " y "
                            + num2);

        scan.close();

    }

}
