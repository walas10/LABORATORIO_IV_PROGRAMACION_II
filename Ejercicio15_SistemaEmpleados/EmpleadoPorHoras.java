public class EmpleadoPorHoras extends Empleado {
    private final double horasTrabajadas;
    private final double pagoPorHora;

    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        if (pagoPorHora <= 0) {
            throw new IllegalArgumentException("El pago por hora debe ser positivo.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * pagoPorHora;
    }
}
