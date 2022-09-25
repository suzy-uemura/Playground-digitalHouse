package poo2;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String id, String nome, int idade, double peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double imc = this.peso/Math.pow(this.altura, 2);

        if(imc < 20 ) {
            System.out.println("IMC: " + imc + " abaixo do peso");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("IMC: " + imc + " peso saudavel");
            return 0;
        } else {
            System.out.println("IMC: " + imc + " sobrepeso");
            return 1;
        }
    }

    public boolean ehMaiorIdade() {
        if(this.idade >= 18 ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return
                "id: " + id +  "\n" +
                "nome: " + nome + "\n" +
                "idade: " + idade + "\n" +
                "peso: " + peso + "\n" +
                "altura: " + altura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
