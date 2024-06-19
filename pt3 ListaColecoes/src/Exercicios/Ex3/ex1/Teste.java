package Exercicios.Ex3.ex1;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        Classe classe1 = new Classe("1");
        Classe classe2 = new Classe("2");
        Classe classe3 = new Classe("3");
    
        ArrayList<Classe> listaDeCoisa = new ArrayList<>(); //podia usar ArrayList<String> listaStrings = new ArrayList<>();
    
        listaDeCoisa.add(classe1);
        listaDeCoisa.add(classe2);
        listaDeCoisa.add(classe3);

        for (Classe item : listaDeCoisa) {
            System.out.println(item);
        }
        
    }
}
