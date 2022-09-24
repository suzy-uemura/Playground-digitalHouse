package poo1.corridaSelvagem;

import java.util.List;

public class MaratonaSelva {
    private List<Circuito> listaCircuitos;
    private int totalInscritos;
    private int valorTotalArrecadado;


    public MaratonaSelva(List<Circuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
    }
    public List<Circuito> getListaCircuitos() {
        return listaCircuitos;
    }

    public void setListaCircuitos(List<Circuito> listaCircuitos) {
        this.listaCircuitos = listaCircuitos;
    }

    public int getTotalInscritos() {
        for(int i = 0; i < listaCircuitos.size(); i++) {
            for (int a = 0; a < listaCircuitos.get(i).getInscricoes().size(); a++) {
               totalInscritos =  listaCircuitos.get(i).getInscricoes().stream().toList().get(a).getMaratonista().getCodigo();
            }
        }
        return this.totalInscritos;
    }

    public int getValorTotalArrecadado() {
        for(int i = 0; i < listaCircuitos.size(); i++) {
            for (int a = 0; a < listaCircuitos.get(i).getInscricoes().size(); a ++) {
                this.valorTotalArrecadado +=  listaCircuitos.get(i).getInscricoes().stream()
                        .toList().get(a).getValorInscricao();
            }
        }
        return valorTotalArrecadado;
    }
}
