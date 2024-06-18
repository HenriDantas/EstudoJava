package Exercicios.Ex2;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 1.99, 100);

        Produto produto2 = new Produto("borracha", 2.99, 15);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(0));
        System.out.println(listaDeProdutos.toString());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Tomate", 10, 5, "20/06/2024");
        listaDeProdutos.add(produtoPerecivel);
        System.out.println(listaDeProdutos.get(2));
        System.out.println(listaDeProdutos.toString());


    }
}
