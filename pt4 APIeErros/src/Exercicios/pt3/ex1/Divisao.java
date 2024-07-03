package Exercicios.pt3.ex1;

public class Divisao {
    private double divisao;
    public Divisao(int n1, int n2){
        this.divisao = n1 / n2;
        if(divisao <=0){
            throw new ErroDividido("Resultado da divisão menor que 0");
        }
    }

    public double getDivisao() {
        return divisao;
    }

}
