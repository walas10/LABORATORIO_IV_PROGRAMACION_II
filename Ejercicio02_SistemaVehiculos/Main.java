public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            new Carro("Toyota", "Corolla", 4),
            new Moto("Honda", "CB500F", 500)
        };
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDatos();
        }
    }
}
