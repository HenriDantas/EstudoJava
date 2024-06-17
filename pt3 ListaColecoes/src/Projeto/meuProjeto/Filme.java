package Projeto.meuProjeto;

import Projeto.Calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacao() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoLancamento() + ")";
    }
}
