package Exercicios.pt2.Ex2;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Teste {

    public static void main(String[] args) {
        
        String jsonPessoa = "{\"Nome\":\"Rodrigo\",\"Idade\":20,\"Cidade\":\"São paulo\", \"Estado\": \"São paulo\" }";
        System.out.println("jsonPessoa: " + jsonPessoa);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        Pessoa gsonPessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("gsonPessoa: " + gsonPessoa);
    }
}
