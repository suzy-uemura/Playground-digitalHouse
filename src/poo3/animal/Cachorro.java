package poo3.animal;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    public void comerCarne() {
        System.out.println("Comendo racao");
    }
}
