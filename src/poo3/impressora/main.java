package poo3.impressora;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<String> habilidadades = new ArrayList<>();
        habilidadades.add("Cozinhar");
        habilidadades.add("Tocar violao");
        habilidadades.add("Cantar");


        Curriculo curriculo =new Curriculo("CUR912","Alex", 21, habilidadades);
        Impressora.imprimir(curriculo);

        Livro livro =new Livro("LIV990", 2983, "Anser Silva", "Testes", "Java");
        Impressora.imprimir(livro);

        Relatorios relatorio = new Relatorios("RLT 0009", "horizonal", 15, "Joao", "Maria");
        Impressora.imprimir(relatorio);
    }
}
