package poo3.impressora;

import java.util.stream.Stream;

public interface Impressora {

    static void imprimir(Imprimiveis imprimivel) {
        System.out.println(imprimivel.toString());
    }
}
