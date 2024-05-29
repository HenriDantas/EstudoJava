package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class advinha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = new Random().nextInt(100);
        
        for (int i = 0; i < 5; i++ ){
            System.out.println("\nQual numero eu pensei? ");
            int chute = ler.nextInt();

            if(chute == numero){
                System.out.println("CERTIN parabens");
                break;
            } else { 
                System.out.println("erou");
                if(i != 4){
                    if(chute > numero){
                        System.out.println("vo da uma dica, o numero é menor que %d".formatted(chute));
                    } else {
                        System.out.println("vo da uma dica, o numero é maior que %d".formatted(chute));
                    }
                    System.out.println("Tenta dnv, vai\n");
                } else {
                    System.out.println("perdeesssteeee.... o numero que eu pensei foi %d".formatted(numero));
                }
            }



        }
    }
}
