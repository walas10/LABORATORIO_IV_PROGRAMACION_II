public class Main {
    public static void main(String[] args) {
        double[] notas = {85, 90, 78, 92, 88};
        double suma = 0;

        for (double nota : notas) {
            suma += nota;
        }

        double promedio = suma / notas.length;
        System.out.println("Promedio de notas: " + promedio);
    }
}
