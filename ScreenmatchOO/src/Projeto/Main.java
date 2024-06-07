package Projeto;
import Projeto.Calculo.CalculoDeTempo;
import Projeto.meuProjeto.Filme;
import Projeto.meuProjeto.Serie;

public class Main {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();

        filme1.setAnoLancamento(2005);
        filme1.setDuracaoEmMinutos(81);
        filme1.setIncluidoNoPlano(false);
        filme1.setNome("O Galinho Chicken Little");
        filme1.avaliaFilme(10.5);
        filme1.avaliaFilme(8);
        filme1.avaliaFilme(6);
        filme1.exibeInfos();
        
        System.out.println("Média de avaliação: %.2f".formatted(filme1.mediaAvaliacao()));

        Filme filme2 = new Filme();
        filme2.setNome("John Wick");
        filme2.setAnoLancamento(2014);
        filme2.setDuracaoEmMinutos(101);
        filme2.setIncluidoNoPlano(true);

        Serie serie1 = new Serie();
        serie1.setNome("La Casa de Papel");
        serie1.setAnoLancamento(2017);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(true);
        serie1.setTemporadas(5);
        serie1.setEpPorTemp(10);
        serie1.setMinPorEp(45);

        CalculoDeTempo calculoDeTempo = new CalculoDeTempo();
        calculoDeTempo.incluiNoTempo(filme1);
        calculoDeTempo.incluiNoTempo(serie1);
        calculoDeTempo.incluiNoTempo(filme2);
        System.out.println(calculoDeTempo.getTempoTotal());

    }
}
