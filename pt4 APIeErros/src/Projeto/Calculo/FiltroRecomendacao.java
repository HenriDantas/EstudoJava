package Projeto.Calculo;


public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Preferidos da galera");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliado");
        } else {
            System.out.println("Assista mais tarde");
        }
    }
}
