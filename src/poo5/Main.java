package poo5;

public class Main {
    public static void main(String[] args) {

        Corrida corrida = new Corrida(1000, 2000, "CORRIDA MALUCA", 20);
        corrida.addCarro(200, 8, 2, "ABC");
        corrida.addCarro(50, 10, 8, "DEF");
        corrida.addCarro(400, 10, 1, "GHI");
        corrida.addMotocicleta(20, 3, 9, "JKL");
        corrida.addMotocicleta(200, 2, 3, "MNO");

        System.out.println("===== COMPETIDORES =====");
        System.out.println(corrida.getVeiculoList().toString());

        System.out.println("===== DELETANDO COMPETIDOR =====");
        corrida.deletaVeiculo(corrida.getVeiculoList().get(0));
        System.out.println(corrida.getVeiculoList().toString());

        System.out.println("===== GANHADOR =====");
        System.out.println(corrida.getVencedor());

        System.out.println("===== SOCORRENDO.... =====");
        corrida.socorreMoto("jkl");
    }
}
