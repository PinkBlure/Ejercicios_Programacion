import java.util.Scanner;

public class Actividad_6 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Dame tu nombre: ");
        String name = scan.nextLine();

        System.out.println("\nBienvenido a mi aplicación " + name); 

        scan.close();
    }

}
