package Exercicios.Pratica3.Ex4;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero){ //aq podia bota um texto para mandar no console, ao inves de um bool por exemplo
        if (numero <= 1) {                           //MAS como no gerador ele usa ele, para não ter q fazer um ctrl c ctrl v, deixa ele assim
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verificarPrimalidade(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
