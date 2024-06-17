package Exercicios.Ex1;

public class Pessoa {
    private String nome;
    private int idade;


    public void setPessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", Idade: " + this.idade;
    }
}
