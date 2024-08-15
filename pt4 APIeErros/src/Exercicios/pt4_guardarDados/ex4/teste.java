package Exercicios.pt4_guardarDados.ex4;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class teste {
    public static void main(String[] args) throws IOException {
        Veiculo veiculo = new Veiculo("UNO", 2020, "Azul", "FRJ2E0", "Henri");
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        gson.toJson(veiculo);

        FileWriter escrever = new FileWriter("veiculo.json");
        escrever.write(gson.toJson(veiculo));
        escrever.close();

    }
    
}
