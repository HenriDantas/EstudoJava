package Exercicios.pt3.Ex2;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua senha: ");
        String senha = ler.nextLine();
        try {
            new ValidarSenha(senha);
            System.out.println("Senha autorizada");
        } catch (ErroSenhaException e) {
            System.out.println("Erro");
            System.out.println(e.getMessage());
        }
    }
}
