public class ProductoDigital extends Producto {
    private final double tamanioMegabytes;

    public ProductoDigital(String nombre, double precio, double tamanioMegabytes) {
        super(nombre, precio);
        if (tamanioMegabytes <= 0) {
            throw new IllegalArgumentException("El tamaño del archivo debe ser positivo.");
        }
        this.tamanioMegabytes = tamanioMegabytes;
    }

    public double getTamanioMegabytes() {
        return tamanioMegabytes;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Producto digital: %s - Precio: Q%.2f - Tamaño: %.2f MB%n",
                getNombre(), getPrecio(), tamanioMegabytes);
    }
}
