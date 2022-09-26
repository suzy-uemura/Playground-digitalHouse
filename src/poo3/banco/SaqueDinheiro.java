package poo3.banco;

public class SaqueDinheiro implements Transacao{
    @Override
    public void transacaoOK() {
        System.out.println("Saque dinheiro realizado");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Saque dinheiro NAO realizado");
    }
}
