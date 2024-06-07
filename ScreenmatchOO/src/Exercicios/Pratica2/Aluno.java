package Exercicios.Pratica2;

public class Aluno {
    private String nome;
    private double notas;
    private int qtdProvas;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }
    public void setNotas(double notas) {
        this.notas += notas;
        this.qtdProvas++;
    }

    public double calcularMedia(){
        double media = this.notas / this.qtdProvas;
        return media;
    }


}
