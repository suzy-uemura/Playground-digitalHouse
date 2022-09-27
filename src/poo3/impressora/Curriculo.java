package poo3.impressora;

import java.util.List;

public class Curriculo extends Imprimiveis{
    private String nome;
    private int idade;
    private List<String> habilidades;

    public Curriculo(String documento, String nome, int idade, List<String> habilidades) {
        super(documento);
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getCaracteristicas() {
        return habilidades;
    }

    public void setCaracteristicas(List<String> caracteristicas) {
        this.habilidades = caracteristicas;
    }

    @Override
    public String toString() {
        return "Curriculo: " +
                "nome " + nome +
                ", idade " + idade +
                ", habilidades " + habilidades + "\n";
    }
}
