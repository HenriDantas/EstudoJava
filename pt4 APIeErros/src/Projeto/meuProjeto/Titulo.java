package Projeto.meuProjeto;


import com.google.gson.annotations.SerializedName;

import Projeto.excecao.ErroConversaoDoAnoException;

public class Titulo {

    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento){
        this.anoLancamento = anoLancamento;
        this.nome = nome;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();
        if(tituloOmdb.year().length() > 4){
            throw new ErroConversaoDoAnoException("Erro ao converter o ano, forma que veio inválida");
        }
        this.anoLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLançamento) {
        this.anoLancamento = anoLançamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }
    // public void setSomaAvaliacao(double somaAvaliacao) {
    //     this.somaAvaliacao = somaAvaliacao;
    // } n é ideal poder alterar isso no projeto ent n precisaria desse set

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    // public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
    //     this.totalDeAvaliacoes = totalDeAvaliacoes;
    // } n é ideal poder alterar isso no projeto ent n precisaria desse set

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }



    public void exibeInfos(){
        System.out.println("Nome filme: %s".formatted(nome));
        System.out.println("Ano: %d".formatted(anoLancamento));
        // System.out.println("Incluido no plano: ");
        System.out.println("Avaliação: %.2f".formatted(somaAvaliacao));
        System.out.println("Total de avaliações: %d".formatted(totalDeAvaliacoes));
        System.out.println("Duração: %dMin".formatted(duracaoEmMinutos));
    }

    public void avaliaTitulo(double nota){
        somaAvaliacao += nota;
        totalDeAvaliacoes++;
    }

    public double mediaAvaliacao(){
        return somaAvaliacao / totalDeAvaliacoes;       
    }

    @Override
    public String toString() {
        return "(nome: " + nome + ", Ano lançamento: " + anoLancamento + " e Duração: " + duracaoEmMinutos + ")";
    }

}
