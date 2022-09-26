package poo3.banco;

public class PagServicos implements Transacao{
    @Override
    public void transacaoOK() {
        System.out.println("Pagamento realizado");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Pagamento NAO realizado");
    }
}
