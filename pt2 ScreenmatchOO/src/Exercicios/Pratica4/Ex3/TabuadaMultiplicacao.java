package Exercicios.Pratica4.Ex3;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            System.out.println("%d X %d = %d".formatted(numero, i, numero * i));
        }
    }
}
