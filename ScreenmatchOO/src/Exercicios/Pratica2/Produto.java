package Exercicios.Pratica2;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(int desconto){

        double precoComDesconto = this.preco - (this.preco * desconto / 100)  ;

        return precoComDesconto;
    }
}
