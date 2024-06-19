package Exercicios.Ex3.ex1;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("teste");
        listaString.add("testee");
        listaString.add("etessteeee");

        for (String string : listaString) {
            System.out.println(string);
        }
    }
}
