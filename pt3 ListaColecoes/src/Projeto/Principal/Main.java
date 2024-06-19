package Projeto.Principal;
import java.util.ArrayList;

import Projeto.Calculo.CalculoDeTempo;
import Projeto.Calculo.FiltroRecomendacao;
import Projeto.meuProjeto.Episodio;
import Projeto.meuProjeto.Filme;
import Projeto.meuProjeto.Serie;
import Projeto.meuProjeto.Titulo;

public class Main {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme("O Galinho Chicken Little", 2005);
        filme1.setDuracaoEmMinutos(81);
        filme1.setIncluidoNoPlano(false);
        filme1.avaliaTitulo(10.5);
        filme1.avaliaTitulo(8);
        filme1.avaliaTitulo(6);
        filme1.exibeInfos();
        
        System.out.println("Média de avaliação: %.2f".formatted(filme1.mediaAvaliacao()));

        Filme filme2 = new Filme("John Wick", 2014);
        filme2.setDuracaoEmMinutos(101);
        filme2.setIncluidoNoPlano(true);
        filme2.avaliaTitulo(6);
        filme2.avaliaTitulo(8);

        Serie serie1 = new Serie("La Casa de Papel", 2017);
        serie1.setIncluidoNoPlano(true);
        serie1.setAtiva(true);
        serie1.setTemporadas(5);
        serie1.setEpPorTemp(10);
        serie1.setMinPorEp(45);
        // serie1.avaliaTitulo(6); //serie n tem (ainda metodo para pegar classificação)
        // serie1.avaliaTitulo(10); 

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

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);
        listaDeAssistidos.add(serie1);
        for(Titulo item: listaDeAssistidos){ //para cada item que ta dentro de listadeassistidos, vai executar oq tiver dentro
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação do Filme "+ filme.getNome() + ": nota " + + filme.getClassificacao());
            }
        }
        // System.out.println(listaDeAssistidos.size());
        // System.out.println(listaDeAssistidos);                           //fazendo o override na classe filme quando vai pegar a lista ela precisa passar pela classe, então, ela passa pelo toString() de filme ao inves do toString() de objects
        // System.out.println(listaDeAssistidos.get(0).toString());


    }
}
