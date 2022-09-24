package poo1.corridaSelvagem;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Maratonista {
    private int codigo;
    private long RG;
    private String nome;
    private String sobrenome;
    private int idade;
    private long celular;
    private long numEmercia;
    private String grupoSanguinio;

    public Maratonista(int codigo, long RG, String nome, String sobrenome, int idade, long celular, long numEmercia, String grupoSanguinio) {
        this.codigo = codigo;
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.celular = celular;
        this.numEmercia = numEmercia;
        this.grupoSanguinio = grupoSanguinio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getNumEmercia() {
        return numEmercia;
    }

    public void setNumEmercia(long numEmercia) {
        this.numEmercia = numEmercia;
    }

    public String getGrupoSanguinio() {
        return grupoSanguinio;
    }

    public void setGrupoSanguinio(String grupoSanguinio) {
        this.grupoSanguinio = grupoSanguinio;
    }
}
