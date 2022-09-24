package poo1.corridaSelvagem;

public class Inscricao {
    private Maratonista maratonista;
    private Categoria categoria;
    private double valorInscricao;

    public Inscricao(Maratonista maratonista, Categoria categoria) {
        try {
            this.maratonista = maratonista;
            this.categoria = categoria;
            setValorInscricao(maratonista, categoria);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Maratonista getMaratonista() {
        return maratonista;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public double getValorInscricao() {
        return valorInscricao;
    }
    private void setValorInscricao(Maratonista maratonista, Categoria categoria) throws Exception {
        if(maratonista.getIdade() > 18 && categoria.equals(Categoria.CIRCUITO_PEQ)) {
            this.valorInscricao = 1500;
        } else if (maratonista.getIdade() < 18 && categoria.equals(Categoria.CIRCUITO_PEQ)) {
            this.valorInscricao = 1300;
        } else if (maratonista.getIdade() > 18 && categoria.equals(Categoria.CIRCUITO_MED)) {
            this.valorInscricao = 2300;
        } else if (maratonista.getIdade() < 18 && categoria.equals(Categoria.CIRCUITO_MED)) {
            this.valorInscricao = 2000;
        } else if (maratonista.getIdade() > 18 && categoria.equals(Categoria.CIRCUITO_AVAN)) {
            this.valorInscricao = 2800;
        } else if (maratonista.getIdade() < 18 && categoria.equals(Categoria.CIRCUITO_AVAN)) {
            throw new Exception("Menores de 18 anos não podem se inscrever em CIRCUITOS AVANÇADOS");
        }
    }


    public void infoMaratonista() {
        System.out.println(
                "Cod.: " + this.maratonista.getCodigo() + "\n" +
                "RG: " + this.maratonista.getRG() + "\n" +
                "Nome: " + this.maratonista.getNome() + "\n" +
                "Idade: " + this.maratonista.getIdade() + "\n" +
                "Sobrenome: " + this.maratonista.getSobrenome() + "\n" +
                "Celular: " + this.maratonista.getCelular() + "\n" +
                "Número de emergencia: " + this.maratonista.getNumEmercia() + "\n" +
                "Tipo sanguineo: " + this.maratonista.getGrupoSanguinio() + "\n"
        );
    }
}
