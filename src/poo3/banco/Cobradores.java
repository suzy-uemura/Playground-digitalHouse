package poo3.banco;

public class Cobradores {

    public void realizarConsultaSaldo(ConsultaSaldo cs) {
        cs.transacaoOK();
    }

    public void naoRealizarConsultaSaldo(ConsultaSaldo cs) {
        cs.transacaoNaoOk();
    }

    public void realizarSaqueDinheiro(SaqueDinheiro sd) {
        sd.transacaoOK();
    }

    public void naoRealizarSaqueDinheiro(SaqueDinheiro sd) {
        sd.transacaoNaoOk();
    }
}
