package poo4.supermercado;

public class Produto {
    private int codProd;
    private String nome;
    private int qtde;
    private double preco;

    public Produto(int codProd, String nome, int qtde, double preco) {
        this.codProd = codProd;
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
