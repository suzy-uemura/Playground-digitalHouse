package poo3.veiculo;

import java.util.List;

public class Garagem {
    private int id;
    private List<Veiculo> veiculoList;

    public Garagem(int id, List<Veiculo> veiculoList) {
        this.id = id;
        this.veiculoList = veiculoList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }

    public void setVeiculoList(List<Veiculo> veiculoList) {
        this.veiculoList = veiculoList;
    }
}
