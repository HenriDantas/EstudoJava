package Exercicios.Pratica3.Ex3;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(int valor){
        saldo += valor;
    }

    public void sacar(int valor){
        if(saldo < valor){
            System.out.println("Valor maior que o possuido");    
        } else {
            saldo -= valor;
        }
        
    }

}
