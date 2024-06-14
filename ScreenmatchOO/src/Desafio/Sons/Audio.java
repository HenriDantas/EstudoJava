package Desafio.Sons;


import java.util.Scanner;

public class Audio {

    private String nome;
    private double duracaoEmMinutos;
    private int totalVisualizacoes;
    private int curtidas;
    private double classificacao;
    private String dataLancamento; //Date?
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }
    // public void setTotalVisualizacoes(int totalVisualizacoes) {
    //     this.totalVisualizacoes = totalVisualizacoes;
    // }

    public int getCurtidas() {
        return curtidas;
    }
    // public void setCurtidas(int curtidas) {
    //     this.curtidas = curtidas;
    // }

    public double getClassificacao() {
        return classificacao;
    }
    // public void setClassificacao(double classificacao) {
    //     this.classificacao = classificacao;
    // }

    public String getDataDeLancamento() {
        return dataLancamento;
    }
    public void setDataDeLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void curtir(){
        curtidas++;
    }

    public void avaliar(){
        Scanner ler = new System.in();
        System.out.println("Avalie com nota de 0 a 5");
        nota += ler.nextDouble();
        totalAvaliacoes++;
    }

    public void darPlay(){
        totalVisualizacoes++;
        System.out.println("tocando: " + nome);
    }

}
