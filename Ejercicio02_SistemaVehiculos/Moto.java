public class Moto extends Vehiculo {
    private final int cilindrada;
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() { return cilindrada; }
    @Override
    public void mostrarDatos() {
        System.out.println("Moto: " + getMarca() + " " + getModelo()
                + ", cilindrada: " + cilindrada + " cc");
    }
}
