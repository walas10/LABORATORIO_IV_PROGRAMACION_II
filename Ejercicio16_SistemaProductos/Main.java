public class Main {
    public static void main(String[] args) {
        Producto[] productos = {
            new ProductoFisico("Teclado", 250.00, 0.80),
            new ProductoDigital("Curso de Java", 175.00, 950.00)
        };

        for (Producto producto : productos) {
            producto.mostrarInformacion();
        }
    }
}
