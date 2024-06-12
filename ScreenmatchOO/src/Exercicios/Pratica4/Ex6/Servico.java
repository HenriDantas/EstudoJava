package Exercicios.Pratica4.Ex6;

public class Servico implements Vendivel{
    private double precoHora;

    public double getPrecoHora() {
        return precoHora;
    }
    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public double aplicarDesconto(double descontoPercentual) {
        return precoHora -= precoHora * (descontoPercentual / 100.0);
    }


}
