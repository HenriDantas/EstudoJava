import Desafio.Sons.Musica;
import Desafio.Sons.Podcast;

public class MainDesafio {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setNome("Navigating");
        minhaMusica.setCantor("Twenty one pilots");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.darPlay();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setNome("Podpah");
        meuPodcast.setParticipante("Igão e mitico");
        meuPodcast.setConvidado("");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.darPlay();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }
    }
}
