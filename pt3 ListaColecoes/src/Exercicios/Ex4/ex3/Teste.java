package Exercicios.Ex4.ex3;

import java.util.ArrayList;
import java.util.Collections;

public class Teste {
    public static void main(String[] args) {
        Titulo titulo1 = new Titulo("Os desempregados");
        Titulo titulo2 = new Titulo("Sobrenatural");
        Titulo titulo3 = new Titulo("A fuga das galinhas 2");
        Titulo titulo4 = new Titulo("A fuga das galinhas");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        System.out.println(listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos); //assim
        for (Titulo titulo : listaDeTitulos) { //ou com foreach
            System.out.println(titulo);
        }
    }
}
