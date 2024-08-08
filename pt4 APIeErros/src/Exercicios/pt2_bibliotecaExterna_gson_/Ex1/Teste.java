package Exercicios.pt2_bibliotecaExterna_gson_.Ex1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Teste {

    public static void main(String[] args) {
        
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        System.out.println("jsonPessoa: " + jsonPessoa);

        Gson gson = new GsonBuilder().create();
        Pessoa gsonPessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        
        System.out.println("gsonPessoa: " + gsonPessoa);
    }
}
