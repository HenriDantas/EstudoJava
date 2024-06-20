package Exercicios.Ex4.ex4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teste {
    public static void main(String[] args) { // só para testar que funciona com likedlist e arraylist
        List<String> listaArray = new ArrayList<>();
        
        listaArray.add("Teste 1");
        listaArray.add("Tes1te");
        listaArray.add("1 teste");

        System.out.println(listaArray);

        List<String> listaLinked = new LinkedList<>();
        
        listaLinked.add("Teste 1");
        listaLinked.add("Tes1te");
        listaLinked.add("1 teste");

        System.out.println(listaLinked);
    }
}   
