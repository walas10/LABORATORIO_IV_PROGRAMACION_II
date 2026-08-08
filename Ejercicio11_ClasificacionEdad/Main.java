import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 12) {
                System.out.println("Clasificación: Niño");
            } else if (edad < 18) {
                System.out.println("Clasificación: Adolescente");
            } else {
                System.out.println("Clasificación: Adulto");
            }
        }
    }
}
