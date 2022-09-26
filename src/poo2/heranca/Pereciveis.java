package poo2.heranca;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int qtdProdutos) {
        if(this.diasParaVencer == 1) {
            return  qtdProdutos * (getPreco() / 4);
        } else if (this.diasParaVencer == 2) {
            return  qtdProdutos * (getPreco() / 3);
        } else if (this.diasParaVencer == 3) {
            return  qtdProdutos * (getPreco() / 2);
        } else {
            return super.calcular(qtdProdutos);
        }

    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return "Dias Para Vencer:  " + diasParaVencer;

    }
}
