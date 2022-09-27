package poo3.veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Ford", "Fiesta", 1000);
        Veiculo v2 = new Veiculo("Ford", "Focus", 1200);
        Veiculo v3 = new Veiculo("Ford", "Explorer", 2500);
        Veiculo v4 = new Veiculo("Fiat", "Uno", 500);
        Veiculo v5 = new Veiculo("Fiat", "Cronos", 1000);
        Veiculo v6 = new Veiculo("Fiat", "Torino", 1250);
        Veiculo v7 = new Veiculo("Chevrolet", "Aveo", 1250);
        Veiculo v8 = new Veiculo("Chevrolet", "Spin", 2500);
        Veiculo v9 = new Veiculo("Toyota", "Corola", 1200);
        Veiculo v10 = new Veiculo("Toyota", "Fortuner", 3000);
        Veiculo v11 = new Veiculo("Renault", "Logan", 950);
        Veiculo v12 = new Veiculo("Ford", "Explorer", 2560);

        List<Veiculo> veiculoList = new ArrayList<>();
        veiculoList.add(v1);
        veiculoList.add(v2);
        veiculoList.add(v3);
        veiculoList.add(v4);
        veiculoList.add(v5);
        veiculoList.add(v6);
        veiculoList.add(v7);
        veiculoList.add(v8);
        veiculoList.add(v9);
        veiculoList.add(v10);
        veiculoList.add(v11);
        veiculoList.add(v12);

        Garagem g = new Garagem(001, veiculoList);

        System.out.println(" ====== VEICULOS DO MENOR PRECO A MAIOR PRECO ======");
        veiculoList.stream()
                .sorted((vec, vec2) -> vec.compareTo(vec2))
                .forEach(System.out::println);

        System.out.println(" ====== VEICULOS ORDENADO POR MARCA ======");
        veiculoList.stream()
                   .filter(v -> v.getMarca().equalsIgnoreCase("Explorer"))
                   .sorted((vm1, vm2) -> vm1.getMarca().compareTo(vm2.getMarca()))
                   .forEach(System.out::println);

        System.out.println("===== VEICULOS PRECO MENOR OU IGUAL  QUE MIL =====");
        veiculoList.stream()
                .filter(v -> v.getPreco() <= 1000)
                .forEach(System.out::println);

        System.out.println("===== VEICULOS PRECO MAIOR OU IGUAL A MIL =====");
        veiculoList.stream()
                .filter(v -> v.getPreco() >= 1000)
                .forEach(System.out::println);

        double mediaVeiculos = veiculoList.stream()
                .mapToDouble(v -> v.getPreco())
                .average().getAsDouble();

        System.out.println("Média de preco dos veiculos: " + mediaVeiculos);
    }
}
