package Exercicios.pt3.Ex1;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Fale o numero que será dividido: ");
        int n1 = ler.nextInt();
        System.out.println("Fale o numero que dividirá ele: ");
        int n2 = ler.nextInt();
        try {
            Divisao dividido = new Divisao(n1, n2);
            System.out.println(dividido.getDivisao());
        } catch (ErroDividido e) {
            System.out.println("VIXE DEU ERRO");
            System.out.println(e.getMessage()); 
        }


        
    }
}
