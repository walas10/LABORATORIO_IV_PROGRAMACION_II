public class Revista extends Material {
    private final int numeroEdicion;
    public Revista(String titulo, int anioPublicacion, int numeroEdicion) {
        super(titulo, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + getTitulo() + ", edición: " + numeroEdicion
                + ", publicada en: " + getAnioPublicacion());
    }
}
