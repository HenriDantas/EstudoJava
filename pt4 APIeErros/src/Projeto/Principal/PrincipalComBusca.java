package Projeto.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um filme para buscar: ");
        String filme = ler.nextLine();
        
        String endereco = "http://www.omdbapi.com/?t=" + filme +"&apikey=c21460ab";
        
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                //.uri(URI.create("http://www.omdbapi.com/?t=" + filme +"&apikey=c21460ab")) //ou
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
    }

}
