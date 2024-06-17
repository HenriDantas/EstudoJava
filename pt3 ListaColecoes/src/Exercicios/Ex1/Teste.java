package Exercicios.Ex1;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setPessoa("Henri Dantas", 20);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setPessoa("Enzo Dantas", 26);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setPessoa("Maria Eduarda", 22);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        System.out.println(listaDePessoas.toString());

    }
}
