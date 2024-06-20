package Exercicios.Ex4.ex2;

public class Titulo implements Comparable<Titulo>{
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.titulo.compareTo(titulo.getTitulo());
    }

}
