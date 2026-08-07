public class Libro extends Material {
    private final String autor;
    public Libro(String titulo, int anioPublicacion, String autor) {
        super(titulo, anioPublicacion);
        this.autor = autor;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + getTitulo() + ", autor: " + autor
                + ", publicado en: " + getAnioPublicacion());
    }
}
