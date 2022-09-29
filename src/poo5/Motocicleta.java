package poo5;

public class Motocicleta extends Veiculo{
    public Motocicleta(int velocidade, int aceleracao, int anguloGiro, String placa) {
        super(velocidade, aceleracao, anguloGiro, placa, 300, 2);
    }

    @Override
    public String toString() {
        return "Motocicleta: " + super.toString();
    }
}
