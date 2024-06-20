package Exercicios.Ex4.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(1);
        numeros.add(4);
        numeros.add(3);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
