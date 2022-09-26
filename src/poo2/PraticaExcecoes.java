package poo2;

public class PraticaExcecoes {

    public static void main(String[] args) {

        try {
            int a = 0, b = 300;
            a = b / a;
        } catch (IllegalArgumentException er) {
            er.getCause();
        } finally {
            System.out.println("Programa finalizado.");
        }
    }

}
