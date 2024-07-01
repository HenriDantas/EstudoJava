package Exercicios.pt2.Ex3;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Editora(String nome, String idade) {}
record Livro(String titulo, String autor, Editora editora) {}

public class Teste {
    public static void main(String[] args) {
        //json dentro do json basicamente
        String jsonLivro = "{\"Titulo\":\"Diario de um banana\",\"Autor\":Greg,\"Editora\":{\"Nome\":\"Fabercastel\",\"Idade\":\"28\"}}";

        System.out.println("jsonLivro: " + jsonLivro);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Livro gsonLivro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("gsonLivro: " + gsonLivro);
    }
}
