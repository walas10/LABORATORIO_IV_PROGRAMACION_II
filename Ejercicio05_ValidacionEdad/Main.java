import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                System.out.print("Ingrese su edad: ");
                int edad = scanner.nextInt();

                if (edad <= 0) {
                    throw new IllegalArgumentException("La edad debe ser positiva.");
                }

                System.out.println("Edad válida: " + edad);
            } catch (InputMismatchException e) {
                System.out.println("Error: debe ingresar un número entero.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
