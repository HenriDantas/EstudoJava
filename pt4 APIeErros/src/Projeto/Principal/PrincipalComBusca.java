package Projeto.Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Projeto.excecao.ErroConversaoDoAnoException;
import Projeto.meuProjeto.Titulo;
import Projeto.meuProjeto.TituloOmdb;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um filme para buscar: ");
        String filme = ler.nextLine();
        
        String endereco = "http://www.omdbapi.com/?t=" + filme +"&apikey=c21460ab";
        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                //.uri(URI.create("http://www.omdbapi.com/?t=" + filme +"&apikey=c21460ab")) //ou
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println("tituloomdb: " + tituloOmdb);
        Titulo titulo = new Titulo(tituloOmdb);
        System.out.println("titulo" + titulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (ErroConversaoDoAnoException e) {
           System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        }
        System.out.println("Finalizado");
    }

}
