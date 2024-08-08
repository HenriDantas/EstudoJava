package Exercicios.pt3_execoes.Ex3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Teste {
//usar api publica do github
    


public static void main(String[] args) throws IOException, InterruptedException {
    Scanner ler = new Scanner(System.in);
    System.out.println("Quem deseja procurar no github?");
    String user = ler.nextLine();
    
    String gitHubAPI = "https://api.github.com/users/" + user;
    
    try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(gitHubAPI))
            .header("Accept", "application/vnd.github.v3+json")
            .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404) {
            throw new ErroBuscaUserGitHubException("Usuário não encontrado no GitHub.");
        }

        System.out.println(response.body());    
    } catch (IOException | InterruptedException e) {
        System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
        e.printStackTrace();
    } catch (ErroBuscaUserGitHubException e) {
        System.out.println(e.getMessage());
    }}
}
