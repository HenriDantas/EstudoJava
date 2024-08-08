package Exercicios.pt3_execoes.Ex1;

public class Divisao {
    private double divisao;
    public Divisao(int n1, int n2){
        this.divisao = n1 / n2;
        if(n2 == 0){
            throw new ErroDividido("Não pode dividir por 0");
        }
    }

    public double getDivisao() {
        return divisao;
    }

}
