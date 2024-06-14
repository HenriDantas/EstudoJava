package Desafio.Sons;

public class Podcast extends Audio {
    private String apresentador; //entrevistador
    private String convidado;   //entrevistado
    private String resumo;

    public String getConvidado() {
        return convidado;
    }
    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
    
    public String getParticipante() {
        return participante;
    }
    public void setParticipante(String participante) {
        this.participante = participante;
    }

    @Override 
    public double getClassificacao(){
        if(curtidas > 500) {
            return 10;
        } else {
            return 8;
        }
    }

}
