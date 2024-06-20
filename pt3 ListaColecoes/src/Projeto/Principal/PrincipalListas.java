package Projeto.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Projeto.meuProjeto.Filme;
import Projeto.meuProjeto.Serie;
import Projeto.meuProjeto.Titulo;

public class PrincipalListas {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Henri");
        nomes.add("Roberto");
        nomes.add("Maria");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        Filme filme1 = new Filme("O Galinho Chicken Little", 2005);
        Serie serie1 = new Serie("La Casa de Papel", 2017);
        Filme filme2 = new Filme("John Wick", 2014);

        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(serie1);
        listaDeAssistidos.add(filme1);
        listaDeAssistidos.add(filme2);

        System.out.println(listaDeAssistidos);
        // Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

        listaDeAssistidos.sort(Comparator.comparing(Titulo :: getAnoLancamento));
        System.out.println(listaDeAssistidos);
    }
}
