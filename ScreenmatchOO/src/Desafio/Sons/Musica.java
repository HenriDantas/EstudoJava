package Desafio.Sons;

public class Musica extends Audio{

    private String cantor;
    private String album;
    private String estilo;
    private String letra;

    public String getCantor() {
        return cantor;
    }
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }

    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getLetra() {
        return letra;
    }
    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public double getClassificacao(){
        if(getCurtidas() / getTotalVisualizacoes() > 200) {
            return 10;
        } else {
            return 8;
        }
    }


}
