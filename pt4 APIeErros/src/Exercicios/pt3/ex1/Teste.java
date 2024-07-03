package Exercicios.pt3.ex1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Fale o primeiro numero: ");
        int n1 = ler.nextInt();
        System.out.println("Fale o segundo numero: ");
        int n2 = ler.nextInt();
        Divisao dividido = new Divisao(n1, n2);
        try {
        System.out.println(dividido.getDivisao());
        } catch (ErroDividido e) {
            System.out.println("VIXE DEU ERRO");
            System.out.println(e.getMessage()); 
        }


        
    }
}
