package Exercicios.Pratica4.Ex5;

public class Teste {

    public static void main(String[] args) {
        Livro livro = new Livro();
        System.out.println("Preço do livro é: " + livro.calcularPrecoFinal(15, 5, 20));

        ProdutoFisico produto = new ProdutoFisico();
        System.out.println("Preço do produto é: " + produto.calcularPrecoFinal(5, 3, 100));
    }
}
