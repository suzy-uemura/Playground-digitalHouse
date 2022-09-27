package poo3.impressora;

public class Livro extends Imprimiveis{
    private int nPaginas;
    private String nomeAutor;
    private String titulo;
    private String genero;

    public Livro(String documento, int nPaginas, String nomeAutor, String titulo, String genero) {
        super(documento);
        this.nPaginas = nPaginas;
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro: " +
                "nPaginas " + nPaginas +
                ", nomeAutor " + nomeAutor +
                ", titulo " + titulo +
                ", genero " + genero +  "\n";
    }
}
