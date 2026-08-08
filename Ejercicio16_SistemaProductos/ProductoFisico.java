public class ProductoFisico extends Producto {
    private final double pesoKilogramos;

    public ProductoFisico(String nombre, double precio, double pesoKilogramos) {
        super(nombre, precio);
        if (pesoKilogramos <= 0) {
            throw new IllegalArgumentException("El peso debe ser positivo.");
        }
        this.pesoKilogramos = pesoKilogramos;
    }

    public double getPesoKilogramos() {
        return pesoKilogramos;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Producto físico: %s - Precio: Q%.2f - Peso: %.2f kg%n",
                getNombre(), getPrecio(), pesoKilogramos);
    }
}
