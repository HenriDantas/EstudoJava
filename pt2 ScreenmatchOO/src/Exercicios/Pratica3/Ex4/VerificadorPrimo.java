package Exercicios.Pratica3.Ex4;

public class VerificadorPrimo extends NumerosPrimos {

    public void verificarSeEhPrimo(int numero){//podia colocar isso direto na classe mãe, pq la ele ja verifica, aqui meio q só serve p/ o texto
        if (verificarPrimalidade(numero)) { 
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
