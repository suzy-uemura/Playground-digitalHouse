package poo4.supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        //criar  3 clientes
        clientes.add(new Cliente(001, "Arthur", "Rodrigues"));
        clientes.add(new Cliente(002, "Maria", "Silva"));
        clientes.add(new Cliente(003, "Anderson", "Moreira"));

        System.out.println(" LISTANDO CLIENTES NA TELA ");
        clientes.forEach(System.out::println);


        //deletando um cliente
        clientes.remove(2);

        System.out.println(" CLIENTES QUE SOBRARAM ");
        clientes.forEach(System.out::println);

        //Procurando cliente via console
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O ID DO CLIENTE: ");
        int idCliente = entrada.nextInt();
        clientes.stream()
                .filter( c -> c.getId() == idCliente)
                .forEach(System.out::println);
    }

}
