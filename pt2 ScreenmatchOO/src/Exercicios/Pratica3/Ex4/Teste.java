package Exercicios.Pratica3.Ex4;

public class Teste {

    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(22);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(22);
        System.out.println("O próximo primo após 22 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
