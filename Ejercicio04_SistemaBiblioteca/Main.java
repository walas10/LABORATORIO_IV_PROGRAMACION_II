public class Main {
    public static void main(String[] args) {
        Material[] materiales = {
            new Libro("Cien años de soledad", 1967, "Gabriel García Márquez"),
            new Revista("National Geographic", 2026, 8)
        };
        for (Material material : materiales) {
            material.mostrarInformacion();
        }
    }
}
