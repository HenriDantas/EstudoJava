package Exercicios.Ex3.ex5;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(3);

        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(2);

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(quadrado1);
        listaFormas.add(quadrado2);
        listaFormas.add(circulo1);
        listaFormas.add(circulo2);

        for (Forma forma : listaFormas) {
            System.out.println(forma.calcularArea());
        }
    }
}
