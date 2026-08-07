public class PagoTarjeta extends Pago {
    private final String ultimosDigitos;
    public PagoTarjeta(double monto, String ultimosDigitos) {
        super(monto);
        this.ultimosDigitos = ultimosDigitos;
    }
    @Override
    public void procesarPago() {
        System.out.printf("Pago con tarjeta terminada en %s procesado por Q%.2f%n",
                ultimosDigitos, getMonto());
    }
}
