import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Ingrese un número: ");
                double numero = scanner.nextDouble();
                System.out.println("Número ingresado: " + numero);
            } catch (InputMismatchException e) {
                System.out.println("Error: la entrada no es un número válido.");
            }
        }
    }
}
