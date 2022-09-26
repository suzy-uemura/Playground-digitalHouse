package poo3.banco;

public class Transferencia implements Transacao {


    @Override
    public void transacaoOK() {
        System.out.println("Transacao realizada");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Transacao NAO realizada");
    }
}
