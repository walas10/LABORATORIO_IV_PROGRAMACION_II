import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double primerNumero = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double segundoNumero = scanner.nextDouble();

            System.out.print("Ingrese el tercer número: ");
            double tercerNumero = scanner.nextDouble();

            double mayor = Math.max(primerNumero, Math.max(segundoNumero, tercerNumero));
            System.out.println("El número mayor es: " + mayor);
        }
    }
}
