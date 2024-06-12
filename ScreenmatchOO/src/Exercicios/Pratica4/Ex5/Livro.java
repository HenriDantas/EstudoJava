package Exercicios.Pratica4.Ex5;

public class Livro implements Calculavel{
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo do livro: %s".formatted(titulo));
        System.out.println("Autor do livro: %s".formatted(autor));
    }
    
    @Override
    public double calcularPrecoFinal(int desconto, int taxaAdiconalPercentual, double valor) {
        return valor = valor - (valor * desconto / 100) + (valor * taxaAdiconalPercentual / 100);
    }

    


}
