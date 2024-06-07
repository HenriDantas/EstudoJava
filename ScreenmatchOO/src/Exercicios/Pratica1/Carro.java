package Exercicios.Pratica1;

public class Carro {

    public String modelo;
    public int ano;
    public String cor;

    void exibirInfos(){
        System.out.println("Nome do carro: %s".formatted(modelo));
        System.out.println("Ano do carro: %d".formatted(ano));
        System.out.println("Cor: %s".formatted(cor));
    }

    void idadeCarro(int anoAtual){
        int idade = anoAtual- ano;
        System.out.println("A idade do carro é: " + idade);
    }
}
