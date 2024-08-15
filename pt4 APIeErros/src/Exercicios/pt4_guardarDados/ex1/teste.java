package Exercicios.pt4_guardarDados.ex1;

import java.io.FileWriter;
import java.io.IOException;

public class teste {
    public static void main(String[] args) throws IOException { 
        //exercicio do professor ele fez igual basicamente, mas só coloco um bloco try/catch 

        // String data = "Conteúdo a ser gravado no arquivo.";

        // try (FileWriter writer = new FileWriter("arquivo.txt")) {
        //     writer.write(data);
        //     System.out.println("Dados gravados com sucesso.");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        FileWriter escrita = new FileWriter("arquivo.txt");
        String texto = "Conteúdo a ser gravado no arquivo.";
        escrita.write(texto); 
        escrita.close();
    }
}
