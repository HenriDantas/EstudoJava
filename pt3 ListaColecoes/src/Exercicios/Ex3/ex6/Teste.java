package Exercicios.Ex3.ex6;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 102.5);
        ContaBancaria conta2 = new ContaBancaria(654, 896.21);

        ArrayList<ContaBancaria> listaBancarias = new ArrayList<>();

        listaBancarias.add(conta1);
        listaBancarias.add(conta2);

        double maiorSaldo = 0;
        int contaMaiorSaldo = 0;

        for (ContaBancaria contaBancaria : listaBancarias) {
            if(contaBancaria.getSaldo() > maiorSaldo){
                maiorSaldo = contaBancaria.getSaldo();
                contaMaiorSaldo = contaBancaria.getConta();

            }       
        }
        System.out.println("Conta de maior saldo: " + contaMaiorSaldo + " com salde de " + maiorSaldo);      

    }
}
