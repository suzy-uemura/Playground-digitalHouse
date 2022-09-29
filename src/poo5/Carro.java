package poo5;

public class Carro extends Veiculo{

    public Carro(int velocidade, int aceleracao, int anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, 1000,4);
    }

    @Override
    public String toString() {
        return "Carro: " + super.toString();
    }
}
