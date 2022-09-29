package poo5;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private double distancia;
    private double premioDolares;
    private String nome;
    private int nVeiculos;
    private final List<Veiculo> veiculoList = new ArrayList<>();
    private final SalvaVidasAuto salvaAuto = new SalvaVidasAuto();
    private final SalvaVidasMoto salvaMoto = new SalvaVidasMoto();

    public Corrida(double distancia, double premioDolares, String nome, int nVeiculos) {
        this.distancia = distancia;
        this.premioDolares = premioDolares;
        this.nome = nome;
        this.nVeiculos = nVeiculos;
    }

    public void addCarro(int velocidade, int aceleracao, int anguloGiro, String placa) {
        if (veiculoList.size() < nVeiculos) {
            Carro carro = new Carro(velocidade, aceleracao, anguloGiro, placa);
            this.veiculoList.add(carro);
        } else {
            System.out.println("NÚMERO DE COMPETIDORES EXCEDIDO");
        }

    }

    public void addMotocicleta(int velocidade, int aceleracao, int anguloGiro, String placa) {
        if(veiculoList.size() < nVeiculos) {
            Motocicleta moto = new Motocicleta(velocidade, aceleracao, anguloGiro, placa);
            this.veiculoList.add(moto);
        } else {
            System.out.println("NÚMERO DE COMPETIDORES EXCEDIDO");
        }

    }

    public void deletaVeiculo(Veiculo veiculo) {
        this.veiculoList.remove(veiculo);
    }

    public void deletaVeiculoPlaca(String placa) {
        this.veiculoList.removeIf( r -> r.getPlaca().equalsIgnoreCase(placa));
    }

    public String getVencedor() {
        Veiculo vGanhador = null;
        double velocidade = 0;
        for (int i = 0; i < veiculoList.size(); i++) {
            double velocidade2 = calculoVencedor(this.veiculoList.get(i));
            if(velocidade < velocidade2) {
                velocidade = velocidade2;
                vGanhador = this.veiculoList.get(i);
            }
        }
        return vGanhador.toString();
    }

    public void socorreAuto(String placa) {
        for(Veiculo veiculo: veiculoList) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa) && (veiculo instanceof Carro)) {
                salvaAuto.socorrerAuto((Carro) veiculo);
            }
        }
    }

    public void socorreMoto(String placa) {
        for(Veiculo veiculo: veiculoList) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa) && (veiculo instanceof Motocicleta)) {
                salvaMoto.socorrerMoto((Motocicleta) veiculo);
            }
        }
    }

    private double calculoVencedor(Veiculo v) {
      return v.getVelocidade() * (v.getAceleracao() / 2) / (v.getAnguloGiro() * (v.getPeso() - v.getRodas() * 100));
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioDolares() {
        return premioDolares;
    }

    public void setPremioDolares(double premioDolares) {
        this.premioDolares = premioDolares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnVeiculos() {
        return nVeiculos;
    }

    public void setnVeiculos(int nVeiculos) {
        this.nVeiculos = nVeiculos;
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }


}
