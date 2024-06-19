package Exercicios.Ex3.ex4;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
            Produto produto1 = new Produto("Caneta", 1.99);
            Produto produto2 = new Produto("Borracha", 3.99);
           
            ArrayList<Produto> listaProdutos = new ArrayList<>();
            listaProdutos.add(produto2);
            listaProdutos.add(produto1);
            
            double somaValor = 0;
            for (Produto produto : listaProdutos) {
                somaValor += produto.getPreco();
            }
            System.out.println(somaValor);
            double precoMedio = somaValor / listaProdutos.size();
            System.out.println(precoMedio);
    }
}
