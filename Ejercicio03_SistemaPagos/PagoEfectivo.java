public class PagoEfectivo extends Pago {
    public PagoEfectivo(double monto) { super(monto); }
    @Override
    public void procesarPago() {
        System.out.printf("Pago en efectivo procesado por Q%.2f%n", getMonto());
    }
}
