package poo3.banco;

public class Basico {

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

    public void realizarPagamentoServicos(PagServicos ps) { ps.transacaoOK();}

    public void naoRealizarPagamentoServicos(PagServicos ps) { ps.transacaoOK();}
}
