import java.util.Scanner;

public class Actividad_9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dame los grados centígrados: ");
        float num = scan.nextFloat();

        System.out.println("Los grados Fahrenheit son: "
                         + (32 + (9 * num / 5)));

        scan.close();

    }
}
