package poo3.banco;

public class ConsultaSaldo implements Transacao {

    @Override
    public void transacaoOK() {
        System.out.println("Consulta saldo realizada");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Consulta saldo NAO realizada");
    }
}
