package poo2;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("0001", "Ana",21 );
        Pessoa pessoa3 = new Pessoa("0002", "Joao", 31, 45, 1.50);


        System.out.println("======= Descobrindo a maioridade =======");
        System.out.println(pessoa2.ehMaiorIdade());

        System.out.println("========================================");
        System.out.println(pessoa3);
        pessoa3.calcularIMC();

    }
}
