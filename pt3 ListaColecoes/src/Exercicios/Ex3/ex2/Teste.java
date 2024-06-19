package Exercicios.Ex3.ex2;

public class Teste {
    public static void main(String[] args) {
        Cachorro logan = new Cachorro("Logan", "Huskie");

        if(logan instanceof Cachorro){
            Animal animal = (Animal) logan;
        } else {
            System.out.println("não é um Cachorro.");
        }

    }
}
