package Exercicios.pt4_guardarDados.ex2;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class texte {
    public static void main(String[] args) throws IOException {
        Titulo titulo = new Titulo("Jovens titans", "Netflix");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();


        FileWriter escrever = new FileWriter("titulo.json");
        escrever.write(gson.toJson(titulo));
        escrever.close();
    }
}
