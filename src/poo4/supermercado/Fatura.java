package poo4.supermercado;

import java.util.List;

public class Fatura {
    private Cliente cliente;
    private List<Produto> produtoList;

    private double totalCompra;

    public Fatura(Cliente cliente, List<Produto> produtoList) {
        this.cliente = cliente;
        this.produtoList = produtoList;
    }



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
