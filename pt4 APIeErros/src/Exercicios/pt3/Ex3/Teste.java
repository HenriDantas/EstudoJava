package Exercicios.pt3.Ex3;

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
            .build();
        
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());    
    } catch (ErroBuscaUserGitHubException e) {
        System.out.println(e.getMessage());
    }}
}
