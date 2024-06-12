package Exercicios.Pratica4.Ex6;

public class Produto implements Vendivel{
    private String nome;
    private double precoUnitario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double descontoPercentual) {
        return precoUnitario -= precoUnitario * (descontoPercentual / 100.0);
    }

}
