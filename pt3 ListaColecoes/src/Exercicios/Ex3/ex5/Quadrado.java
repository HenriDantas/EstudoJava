package Exercicios.Ex3.ex5;

public class Quadrado implements Forma{
    private double medida;

    public Quadrado(double medida){
        this.medida = medida;
    }

    public double calcularArea(){
        return medida * medida;
    }
}
