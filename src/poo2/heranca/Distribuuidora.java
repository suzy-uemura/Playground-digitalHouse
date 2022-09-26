package poo2.heranca;

import java.util.ArrayList;
import java.util.List;

public class Distribuuidora {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("caneta", 1.90));
        produtos.add(new Produto("borracha", 4.90));
        produtos.add(new Produto("lapis", 0.90));
        produtos.add(new Produto("caderno", 21.99));
        produtos.add(new Produto("apontador", 2.75));

        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i));
            System.out.println("valor total: " + produtos.get(i).calcular(5));
            System.out.println("===========================================");
        }


    }
}
