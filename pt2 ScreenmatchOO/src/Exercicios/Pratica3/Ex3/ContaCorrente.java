package Exercicios.Pratica3.Ex3;

public class ContaCorrente extends ContaBancaria {

    public void cobraTaxaMensal(int percentual){
        double taxa = saldo * (percentual / 100.0);
        saldo = saldo - taxa;
    }
}
