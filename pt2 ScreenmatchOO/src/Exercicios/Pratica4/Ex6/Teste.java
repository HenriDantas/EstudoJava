package Exercicios.Pratica4.Ex6;

public class Teste {
    public static void main(String[] args) {
        Servico pedrero = new Servico();

        pedrero.setPrecoHora(1000);

        System.out.println(pedrero.calcularPrecoTotal(4));
        System.out.println("com desconto fica: " + pedrero.aplicarDesconto(10));

        Produto caneta = new Produto();
        caneta.setNome("Caneta azul");
        caneta.setPrecoUnitario(5.99);
        System.out.println(caneta.calcularPrecoTotal(5));
        System.out.println("Com desconto fica: " + caneta.aplicarDesconto(5));

    }
}
