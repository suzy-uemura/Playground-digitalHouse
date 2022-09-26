package poo3.banco;

public class Deposito implements Transacao{
    @Override
    public void transacaoOK() {
        System.out.println("Deposito REALIZADO");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Deposito NAO REALIZADO");
    }
}
