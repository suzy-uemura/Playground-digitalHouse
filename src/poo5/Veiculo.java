package poo5;

public abstract class Veiculo {
    private int velocidade;
    private int aceleracao;
    private int anguloGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(int velocidade, int aceleracao, int anguloGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloGiro = anguloGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloGiro() {
        return anguloGiro;
    }

    public void setAnguloGiro(int anguloGiro) {
        this.anguloGiro = anguloGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "velocidade: " + velocidade +
                ", aceleracao: " + aceleracao +
                ", anguloGiro: " + anguloGiro +
                ", placa: " + placa +
                ", peso: " + peso +
                ", rodas: " + rodas + "\n";
    }
}
