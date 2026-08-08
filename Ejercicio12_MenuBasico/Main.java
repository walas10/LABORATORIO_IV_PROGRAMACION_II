import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                System.out.print("Ingrese el primer número: ");
                double primerNumero = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double segundoNumero = scanner.nextDouble();

                double resultado = opcion == 1
                        ? primerNumero + segundoNumero
                        : primerNumero - segundoNumero;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}
