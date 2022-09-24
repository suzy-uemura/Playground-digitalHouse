package poo1.corridaSelvagem;

import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {

        // MARATONISTAS

        Maratonista m1 = new Maratonista(1, 397681690l, "Joao", "Alves", 23,
                119987654321l, 110967765655l, "B-");

        Maratonista m2 = new Maratonista(2, 397681690l, "Maria", "Silva", 16,
                119987654321l, 110967765655l, "B+");

        Maratonista m3 = new Maratonista(3, 397681690l, "Jose", "Castro", 25,
                119987654321l, 110967765655l, "O-");

        Maratonista m4 = new Maratonista(4, 397681690l, "Paulo", "Oliveira", 17,
                119987654321l, 110967765655l, "AB-");

        Maratonista m5 = new Maratonista(5, 397681690l, "Joana", "Dark", 35,
                119987654321l, 110967765655l, "B+");

        Maratonista m6 = new Maratonista(6, 397681690l, "Alessandra", "Silva", 15,
                119987654321l, 110967765655l, "O+");

        //INSCRICOES

        Inscricao i1 = new Inscricao(m1, Categoria.CIRCUITO_PEQ);
        Inscricao i2 = new Inscricao(m2, Categoria.CIRCUITO_PEQ);
        Inscricao i3 = new Inscricao(m3, Categoria.CIRCUITO_MED);
        Inscricao i4 = new Inscricao(m4, Categoria.CIRCUITO_MED);
        Inscricao i5 = new Inscricao(m5, Categoria.CIRCUITO_AVAN);
   //     Inscricao i6 = new Inscricao(m6, Categoria.CIRCUITO_AVAN); LANCAR ERRO E NAO DEIXAR INSCREVER O MENOR DE 18 NA MARATONA
        Inscricao i7 = new Inscricao(m1, Categoria.CIRCUITO_AVAN);

        //LISTA DE INSCRITOS POR MARATONA
        Set<Inscricao> maratonaPeq = new HashSet<>();
        Set<Inscricao> maratonaMed = new HashSet<>();
        Set<Inscricao> maratonaAvan = new HashSet<>();



        maratonaPeq.add(i1);
        maratonaPeq.add(i2);
        maratonaMed.add(i3);
        maratonaMed.add(i4);
        maratonaAvan.add(i5);
  //      maratonaAvan.add(i6); LANCAR ERRO E NAO DEIXAR INSCREVER O MENOR DE 18 NA MARATONA
        maratonaAvan.add(i7);


        //CIRCUITOS

        Circuito circutoP = new Circuito(Categoria.CIRCUITO_PEQ, maratonaPeq);
        Circuito circuitoM = new Circuito(Categoria.CIRCUITO_MED, maratonaMed);
        Circuito circuitoA = new Circuito(Categoria.CIRCUITO_AVAN, maratonaAvan);


        System.out.println("============ LISTANDO MARATONISTAS POR CATEGORIA ============");
        circutoP.listarInscricoes();

        System.out.println("============ REMOVENDO UM MARATONISTA ============");
        circutoP.cancelarInscricao(1);
        circutoP.listarInscricoes();


        //A CATEGORIA DA LISTA DE INSCRICAO PREICSA SER A MESMA CATEGORIA DO CIRCUITO
       // Circuito circuitoTeste = new Circuito(Categoria.CIRCUITO_MED, maratonaPeq);

        //MARATONA SELVAGEM
        List<Circuito> todosCircuitos = new ArrayList<>();
        todosCircuitos.add(circutoP);
        todosCircuitos.add(circuitoM);
        todosCircuitos.add(circuitoA);

        MaratonaSelva maratonaSelva = new MaratonaSelva(todosCircuitos);

        System.out.println("============ INFORMAÇÕES SOBRE A MARATONA ============");
        System.out.println("Valor total arrecadado: " + maratonaSelva.getValorTotalArrecadado());
        System.out.println("Total de inscritos na Maratona Selvagem: " + maratonaSelva.getTotalInscritos());

    }
}
