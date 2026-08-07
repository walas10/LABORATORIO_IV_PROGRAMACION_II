public abstract class Pago {
    private final double monto;
    public Pago(double monto) { this.monto = monto; }
    public double getMonto() { return monto; }
    public abstract void procesarPago();
}
