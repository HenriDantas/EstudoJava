package Desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o limite do cartão?");
        var limite = ler.nextDouble();
        Cartao cartao = new Cartao(limite);
        Carrinho carrinho = new Carrinho();

        
        var n = 1;
        while(n == 1){

            System.out.println("Oque deseja comprar?");
            String produtoNome = ler.next();

            System.out.println("Quanto custa?");
            var produtoPreco = ler.nextDouble();

            Produto produto = new Produto(produtoNome, produtoPreco);
            
            if (cartao.getCredito() >= produto.getPreco()){
                System.out.println("Compra aprovada");
                carrinho.colocarNoCarrinho(produto);
                System.out.println("Saldo: " + cartao.comprar(produto.getPreco())); 
            } else {
                System.out.println("Compra negada");
            }


            System.out.println("Deseja adicionar mais produtos? (1- Sim / 0-Não) ");
            n = ler.nextInt();
        }
        

        Collections.sort(carrinho.getProdutos());
        System.out.println(carrinho.getProdutos() + "\n Saldo atual: " + cartao.getCredito() );

        /* -digitar o limite do cartão x
         * -digitar o que iremos comprar x
         * -digitar o quanto custa isso que iremos comprar x
         * -mostrar compra finalizada x
         * -perguntar se quer continuar ou não a compra(se sim, retorna p começo, se não, para e continua os passos) x
         * -mostrar produtos comprados e o preço deles (ordenado por valor, menor primeiro, mais caro dps) x
         * -mostrar saldo do cartao
         */
    }
}
