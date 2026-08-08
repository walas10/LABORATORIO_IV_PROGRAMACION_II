public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoTiempoCompleto("Ana López", 6500.00),
            new EmpleadoPorHoras("Carlos Pérez", 80, 45.00)
        };

        for (Empleado empleado : empleados) {
            System.out.printf("Empleado: %s - Pago: Q%.2f%n",
                    empleado.getNombre(), empleado.calcularPago());
        }
    }
}
