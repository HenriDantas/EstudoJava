package Desafio.Sons;

public class Podcast extends Audio {
    private String participante; //entrevistador
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

    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
    @Override 
    public double getClassificacao(){
        if(getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }

}
