import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Ingrese el dividendo: ");
                double dividendo = scanner.nextDouble();

                System.out.print("Ingrese el divisor: ");
                double divisor = scanner.nextDouble();

                if (divisor == 0) {
                    throw new ArithmeticException("No se puede dividir entre cero.");
                }

                double resultado = dividendo / divisor;
                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar valores numéricos.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
