package Exercicios.Ex4.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) { 
        List<String> listaPolimorfica;
        
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Teste 1");
        listaPolimorfica.add("Tes1te");
        listaPolimorfica.add("1 teste");

        System.out.println(listaPolimorfica);


        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Teste 2");
        listaPolimorfica.add("Tes2te");
        listaPolimorfica.add("2 teste");

        System.out.println(listaPolimorfica);
    }
}   
