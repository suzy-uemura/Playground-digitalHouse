package poo3.banco;

public class Executivo {

    public void realizarDeposito(Deposito deposito) {
        deposito.transacaoOK();
    }

    public void naoRealizarDeposito(Deposito deposito) {
       deposito.transacaoNaoOk();
    }

    public void realizarTransfeerencia(Transferencia transferencia) {
        transferencia.transacaoOK();
    }

    public void naoRealizarTransferencia(Transferencia transferencia) {
        transferencia.transacaoNaoOk();
    }

}
