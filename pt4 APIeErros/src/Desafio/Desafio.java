package Desafio;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;


public class Desafio {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        System.out.println("Qual seu CEP? ");
        String cep = ler.nextLine();
        String enderecoCep = "https://viacep.com.br/ws/" + cep + "/json/";

        System.out.println(enderecoCep);
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(enderecoCep))
                            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        FileWriter escrever = new FileWriter("./src/Desafio/CEP.json");
        escrever.write(response.body());
        escrever.close();
        System.out.println(response.body());
    }
}
