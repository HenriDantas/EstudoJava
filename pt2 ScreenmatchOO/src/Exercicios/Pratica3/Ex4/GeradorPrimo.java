package Exercicios.Pratica3.Ex4;

public class GeradorPrimo extends NumerosPrimos {

    public int gerarProximoPrimo(int ultimoNumConhecido){
        int proximoNumero = ultimoNumConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
