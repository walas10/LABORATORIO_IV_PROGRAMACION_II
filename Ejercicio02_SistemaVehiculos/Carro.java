public class Carro extends Vehiculo {
    private final int numeroPuertas;
    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }
    public int getNumeroPuertas() { return numeroPuertas; }
    @Override
    public void mostrarDatos() {
        System.out.println("Carro: " + getMarca() + " " + getModelo()
                + ", puertas: " + numeroPuertas);
    }
}
