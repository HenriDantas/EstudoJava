package Projeto.Calculo;

import Projeto.meuProjeto.Titulo;

public class CalculoDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiNoTempo(Titulo titulo){ //POLIMORFISMO
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
