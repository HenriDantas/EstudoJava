package Desafio;

public class Cartao {
    private double credito;
    private int numero;
    

    public Cartao(double credito){
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public int getNumero() {
        return numero;
    }

    public double comprar(double preco){
        return this.credito -= preco;
    }
}
