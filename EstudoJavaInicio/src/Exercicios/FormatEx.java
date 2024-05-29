package Exercicios;

public class FormatEx {

    public static void main(String[] args) {
        String nome = "Henri";
        int idade = 20;
        double valor = 10.2;
        // System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
        
        String mensagem = "oi meu nome é  %s, tenho %d anos e hoje gastei %.2f reais".formatted(nome, idade, valor);
        System.out.println(mensagem);
    }
}
