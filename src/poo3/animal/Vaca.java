package poo3.animal;

public class Vaca extends Animal implements Herbivoro{

    @Override
    public void comerPasto() {
        System.out.println("Comendo pasto");
    }
}
