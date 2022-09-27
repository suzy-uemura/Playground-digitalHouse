package poo3.animal;

public class main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.emitirSom("Auau");
        dog.comerCarne();

        Gato cat = new Gato();
        cat.emitirSom("Miau");
        cat.comerCarne();

        Vaca caw = new Vaca();
        caw.emitirSom("muu");
        caw.comerPasto();
    }
}
