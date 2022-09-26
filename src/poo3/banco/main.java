package poo3.banco;

public class main {

    public static void main(String[] args) {

        Executivo exc = new Executivo();

        Deposito dep = new Deposito();
        exc.naoRealizarDeposito(dep);

        Transferencia t = new Transferencia();
        exc.realizarTransfeerencia(t);


    }





}
