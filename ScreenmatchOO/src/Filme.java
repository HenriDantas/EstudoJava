
public class Filme {

    public String nome;
    public int anoLançamento;
    public boolean incluidoNoPlano;
    public double somaAvaliacao;
    public int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    void exibeInfos(){
        System.out.println("Nome filme: %s".formatted(nome));
        System.out.println("Ano: %d".formatted(anoLançamento));
        // System.out.println("Incluido no plano: ");
        System.out.println("Avaliação: %.2f".formatted(somaAvaliacao));
        System.out.println("Total de avaliações: %d".formatted(totalDeAvaliacoes));
        System.out.println("Duração: %dMin".formatted(duracaoEmMinutos));
    }

    void avaliaFilme(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    double mediaAvaliacao(){
        return somaAvaliacao / totalDeAvaliacoes;       
    }

}
