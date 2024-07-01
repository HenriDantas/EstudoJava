package Exercicios.pt1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://console.cloud.google.com/apis/dashboard?project=estudojava-427713  
        
        System.out.println("Qual livro deseja buscar? ");
        Scanner ler = new Scanner(System.in);
        String livro = ler.nextLine();
        String chave = "";

        String googleBooks = "https://www.googleapis.com/books/v1/volumes?q="+ livro + "&key=" + chave;
        
        HttpClient cliente =  HttpClient.newHttpClient();
        HttpRequest pedido = HttpRequest.newBuilder()
                .uri(URI.create(googleBooks))
                .build();

        HttpResponse<String> response = cliente.send(pedido,  HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body()); 
    }
}
