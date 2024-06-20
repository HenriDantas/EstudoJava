package Exercicios.Ex4.ex3;

public class Titulo implements Comparable<Titulo>{
    private String titulo;

    public Titulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getTitulo().compareTo(titulo.getTitulo());
    }

    @Override
    public String toString() {
        return "Filme: " + getTitulo();
    }

}
