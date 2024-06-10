package Exercicios.Pratica3.Ex3;

public class Teste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        System.out.println("Saldo: " + conta.getSaldo());

        // Realizando operações na conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobraTaxaMensal(30);
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        contaCorrente.sacar(150);
        System.out.println("Saldo: " + contaCorrente.getSaldo());

    }
}
