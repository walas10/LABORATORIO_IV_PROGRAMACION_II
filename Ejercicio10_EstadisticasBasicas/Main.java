import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] numeros = new double[5];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
            }
        }

        double suma = 0;
        double mayor = numeros[0];
        double menor = numeros[0];

        for (double numero : numeros) {
            suma += numero;
            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        double promedio = suma / numeros.length;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
