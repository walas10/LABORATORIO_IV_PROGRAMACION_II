public class EmpleadoTiempoCompleto extends Empleado {
    private final double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        if (salarioMensual <= 0) {
            throw new IllegalArgumentException("El salario mensual debe ser positivo.");
        }
        this.salarioMensual = salarioMensual;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}
