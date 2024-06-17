package Exercicios.Pratica4.Ex5;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(int desconto, int taxaAdiconalPercentual, double valor) {
        return valor = valor - (valor * desconto / 100) + (valor * taxaAdiconalPercentual / 100);
    }
}
