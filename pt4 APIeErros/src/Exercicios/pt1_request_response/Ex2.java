package Exercicios.pt1_request_response;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.coingecko.com/pt/developers/painel 
        
        System.out.println("Nome da moeda: ");
        Scanner ler = new Scanner(System.in);
        String moeda = ler.nextLine();
        // String chave = ""; //n precisa da chave

        String coinGecko = "https://api.coingecko.com/api/v3/simple/price?ids=" + moeda + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(coinGecko))
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        
    }
}
