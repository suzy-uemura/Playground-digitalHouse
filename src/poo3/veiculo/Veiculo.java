package poo3.veiculo;

public class Veiculo implements Comparable<Veiculo>{
    private String modelo;
    private String marca;
    private double preco;

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "-> " +
                "modelo: " + modelo +
                ", marca: " + marca +
                ", preco: " + preco + "\n";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Veiculo veiculo) {
        if(veiculo.getPreco() > this.preco) {
            return -1;
        } else if (veiculo.getPreco() < this.preco) {
            return 1;
        }
        return 0;
    }
}
