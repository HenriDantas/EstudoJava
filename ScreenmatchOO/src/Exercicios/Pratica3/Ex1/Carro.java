package Exercicios.Pratica3.Ex1;

import java.util.Scanner;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    // private int ano;

    public String getNome() {
        return nomeModelo;
    }
    public void setNome(String nome) {
        this.nomeModelo = nome;
    }

    // @Deprecated
    // public double getPrecoAno1() {
    //     return precoAno1;
    // }
    // public double getPrecoAno2() {
    //     return precoAno2;
    // }
    // public double getPrecoAno3() {
    //     return precoAno3;
    // } 

    public void setPreco(double precoAno1, double precoAno2, double precoAno3) {
        // double maiorPreco = 0;
        // Scanner ler = new Scanner(System.in);
        // for(ano = 1; ano < 4; ano++){
        //     System.out.println("Preço no ano %d: ".formatted(ano));
        //     preco = ler.nextDouble();
        //     precoTotal += preco;

        //     if(preco > maiorPreco){
        //         maiorPreco = preco;
        //     }
        // }tentar fazer dps

        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public double maiorPreco(){
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        
        return maiorPreco;
    }

    public double menorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public void pegaInfos(){
        System.out.println("Nome do carro: %s".formatted(nomeModelo));
        System.out.println("Menor preço dos 3 anos: " + menorPreco());
        System.out.println("Maior preço dos 3 anos " + maiorPreco());
    }


}
