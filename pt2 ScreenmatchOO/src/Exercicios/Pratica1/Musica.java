package Exercicios.Pratica1;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLançamento;
    public double somaAvaliacao;
    public int numeroAvaliacoes;

    void exibirInfos(){
        System.out.println("Titulo da musica: %s".formatted(titulo));
        System.out.println("Nome do artista: %s".formatted(artista));
        System.out.println("Ano de lançamento: %d".formatted(anoLançamento));
        System.out.println("Numero de avaliações: %d".formatted(numeroAvaliacoes));
    }

    void avaliar(double nota){
        somaAvaliacao += nota;
        numeroAvaliacoes++;
    }

    double mediaAvaliacao(){
        return somaAvaliacao / numeroAvaliacoes;
    }
}
