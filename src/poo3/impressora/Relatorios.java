package poo3.impressora;

public class Relatorios extends Imprimiveis{
    private String texoComprimento;
    private int nPaginas;
    private String autor;
    private String revisor;

    public Relatorios(String documento, String texoComprimento, int nPaginas, String autor, String revisor) {
        super(documento);
        this.texoComprimento = texoComprimento;
        this.nPaginas = nPaginas;
        this.autor = autor;
        this.revisor = revisor;
    }

    public String getTexoComprimento() {
        return texoComprimento;
    }

    public void setTexoComprimento(String texoComprimento) {
        this.texoComprimento = texoComprimento;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorios: " +
                "texoComprimento " + texoComprimento +
                ", nPaginas " + nPaginas +
                ", autor " + autor +
                ", revisor " + revisor + "\n";
    }
}
