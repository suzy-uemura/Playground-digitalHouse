package poo3.animal;

public class Gato extends Animal implements Carnivoro{

    @Override
    public void comerCarne() {
        System.out.println("Comendo peixe");
    }
}
