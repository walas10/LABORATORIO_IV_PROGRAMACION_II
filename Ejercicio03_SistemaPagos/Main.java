public class Main {
    public static void main(String[] args) {
        Pago[] pagos = {new PagoTarjeta(250.75, "1234"), new PagoEfectivo(100.00)};
        for (Pago pago : pagos) {
            pago.procesarPago();
        }
    }
}
