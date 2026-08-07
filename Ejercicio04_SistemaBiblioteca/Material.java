public abstract class Material {
    private final String titulo;
    private final int anioPublicacion;
    public Material(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public abstract void mostrarInformacion();
}
