import java.util.Scanner;

public class Actividad_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame el precio por unidad: ");
        float precio = scan.nextFloat();
        System.out.print("Dame el número de productos: ");
        float unidades = scan.nextFloat();
        System.out.print("Dame el porcentaje de IVA: ");
        float iva = scan.nextFloat();
        
        System.out.println("\nCompra total: " +
                        ((precio + ((precio * iva)/100)) * unidades));
        scan.close();
    }
}
