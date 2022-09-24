package poo1;

import java.util.HashMap;
import java.util.Map;

public class Temperatura {

    int menorTemp;
    int maiorTemp;

    public Temperatura() {

    }

    public Temperatura(int menorTemp, int maiorTemp) {
        this.menorTemp = menorTemp;
        this.maiorTemp = maiorTemp;
    }

    public void maiorTemperatura(Map<String, Temperatura> cidade) {
        String nomeCidade = null;
        int maiorTemp = 0;
        for(Map.Entry<String, Temperatura> c : cidade.entrySet()) {
            int temp = c.getValue().maiorTemp;
            if (maiorTemp < temp) {
                maiorTemp = temp;
                nomeCidade = c.getKey();
            }
        }
        System.out.println("A temperatura mais alta foi em " + nomeCidade + ", com " + maiorTemp + " C.");
    }

    public void menorTemperatura(Map<String, Temperatura> cidade) {
        String nomeCidade = null;
        int menorTemp = 10;
        for(Map.Entry<String, Temperatura> c : cidade.entrySet()) {
            int temp = c.getValue().menorTemp;
            if (menorTemp > temp) {
                menorTemp = temp;
                nomeCidade = c.getKey();
            }
        }
        System.out.println("A temperatura mais baixa foi em " + nomeCidade + ", com " + menorTemp + " C.");
    }


    public static void main(String[] args) {
        Temperatura t1 = new Temperatura();
        Map<String, Temperatura> cidade = new HashMap<>();

        cidade.put("Londres", new Temperatura(-2, 33));
        cidade.put("Madrid", new Temperatura(-3, 32));
        cidade.put("Nueva York", new Temperatura(-8, 27));
        cidade.put("Buenos Aires", new Temperatura(4, 37));
        cidade.put("Assunción", new Temperatura(6, 42));
        cidade.put("São Paulo", new Temperatura(5, 43));
        cidade.put("Lima", new Temperatura(0, 39));
        cidade.put("Santiago de Chile", new Temperatura(-7, 26));
        cidade.put("Lisboa", new Temperatura(-1, 31));
        cidade.put("Tokio", new Temperatura(-10, 35));

        t1.maiorTemperatura(cidade);
        t1.menorTemperatura(cidade);


    }

}
