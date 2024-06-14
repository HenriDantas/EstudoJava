package Desafio.Sons;

public class Preferido {

    public verificaPreferencia(Audio audio){
        if (audio.getClassificacao >= 8){
            System.out.println("Gosto pacas de " + audio.getNome);
        } else if (audio.getClassificacao >= 3){
            System.out.println("nhe... " + audio.getNome + " é meio termo");
        } else {
            System.out.println("pff tira de perto de mim, odeio " + audio.getNome);
        }
    }
}
