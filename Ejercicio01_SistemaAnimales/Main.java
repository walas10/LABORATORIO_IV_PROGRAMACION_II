public class Main {
    public static void main(String[] args) {
        Animal[] animales = {new Perro("Max"), new Gato("Luna")};
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
