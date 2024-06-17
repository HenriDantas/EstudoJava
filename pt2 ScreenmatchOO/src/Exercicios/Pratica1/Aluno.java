package Exercicios.Pratica1;

public class Aluno {

    public String nome;
    public int idade;

    void exibirInfos(){
        System.out.println("Nome do aluno: %s".formatted(nome));
        System.out.println("Idade do aluno: %d".formatted(idade));
    }

    public static void main(String[] args) { //isso seria em outro arquivo java obv, mas ta assim para "economizar"
        Aluno aluno = new  Aluno();            //os outros n irei fazer isso, ja que seria "tudo igual"

        aluno.nome = "Henri dantas santos";
        aluno.idade = 19;

        aluno.exibirInfos();
    }
}
