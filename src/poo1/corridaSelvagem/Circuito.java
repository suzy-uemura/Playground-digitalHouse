package poo1.corridaSelvagem;

import java.io.IOException;
import java.util.*;

public class Circuito {
    private Categoria categoria;
    private String distancia;
    private Set<Inscricao> inscricoes;

    public Circuito(Categoria categoria, Set<Inscricao> inscricoes) throws IOException {

        if (!(inscricoes.stream().toList().get(0).getCategoria().equals(categoria))) {
            throw new IOException("A categoria da lista de inscricao nao é a mesma categoria do circuito informado");
        }

        this.categoria = categoria;
        this.inscricoes = inscricoes;
        setDistancia(categoria);
    }

    public void cancelarInscricao(int codParticipante) {
        getInscricoes().removeIf( m -> m.getMaratonista().getCodigo() == codParticipante);
    }

    public void listarInscricoes() {
      getInscricoes().forEach(r -> r.infoMaratonista());
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDistancia() {
        return distancia;
    }

    public Set<Inscricao> getInscricoes() {
        return inscricoes;
    }
    private void setDistancia(Categoria categoria) {
        if (categoria.CIRCUITO_PEQ.equals(Categoria.CIRCUITO_PEQ)) {
            this.distancia = "2 km pela selva e riachos.";
        } else if (categoria.CIRCUITO_MED.equals(Categoria.CIRCUITO_MED)) {
            this.distancia = "5 km pela selva, riachos e lama.";
        } else if (categoria.CIRCUITO_AVAN.equals(Categoria.CIRCUITO_AVAN)) {
            this.distancia = "10 km pela selva, riachos, lama e escalada.";
        } else {
            System.out.println("Categoria nao identificada");
        }

    }
}
