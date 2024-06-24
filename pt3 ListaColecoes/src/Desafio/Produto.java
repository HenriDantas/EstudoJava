package Desafio;

public class Produto implements Comparable<Produto> {
    private double preco;
    private String nome;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto: nome=" + this.nome + " Preco=" + this.preco + "\n";
    }
    
    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroProduto.preco));
    }
}
