package Projeto.meuProjeto;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int epPorTemp;
    private int minPorEp;

    public Serie(String nome, int anoLancamento){
        super(nome, anoLancamento);
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() { //ou getAtiva
        return ativa;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTemp() {
        return epPorTemp;
    }
    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    public int getMinPorEp() {
        return minPorEp;
    }
    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    
    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * minPorEp * epPorTemp;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
