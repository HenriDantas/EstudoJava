package Exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.themealdb.com/api.php

        System.out.println("Qual receita quer cozinhar? ");
        Scanner ler = new Scanner(System.in);
        String receita = ler.nextLine();

        String theMealDb = "www.themealdb.com/api/json/v1/1/search.php?s=" + receita;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(theMealDb)) //
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());    
    }
}
