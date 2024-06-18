package Projeto;
import java.util.ArrayList;

import Projeto.Calculo.CalculoDeTempo;
import Projeto.Calculo.FiltroRecomendacao;
import Projeto.meuProjeto.Episodio;
import Projeto.meuProjeto.Filme;
import Projeto.meuProjeto.Serie;

public class Main {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme("O Galinho Chicken Little", 2005);
        filme1.setDuracaoEmMinutos(81);
        filme1.setIncluidoNoPlano(false);
        filme1.avaliaFilme(10.5);
        filme1.avaliaFilme(8);
        filme1.avaliaFilme(6);
        filme1.exibeInfos();
        
        System.out.println("Média de avaliação: %.2f".formatted(filme1.mediaAvaliacao()));

        Filme filme2 = new Filme("John Wick", 2014);
        filme2.setDuracaoEmMinutos(101);
        filme2.setIncluidoNoPlano(true);

        Serie serie1 = new Serie("La Casa de Papel", 2017);
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

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie1);
        primeiro.setTotalAvaliacoes(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme1);
        filtro.filtrar(filme2);
        filtro.filtrar(primeiro);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filme1);
        listaDeFilme.add(filme2);
        // listaDeFilme.add(serie1); só para mostrar que da erro
        System.out.println(listaDeFilme.size());
        System.out.println(listaDeFilme); //fazendo o override na classe filme quando vai pegar a lista ela precisa passar pela classe, então, ela passa pelo toString() de filme ao inves do toString() de objects
        System.out.println(listaDeFilme.get(0).toString());


    }
}
