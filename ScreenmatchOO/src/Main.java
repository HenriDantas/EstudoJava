public class Main {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme();

        filme1.anoLançamento = 2005;
        filme1.duracaoEmMinutos = 81;
        filme1.incluidoNoPlano = false;
        filme1.nome = "O Galinho Chicken Little";

        filme1.avaliaFilme(10.5);
        filme1.avaliaFilme(8);
        filme1.avaliaFilme(6);

        filme1.exibeInfos();
        
        System.out.println("Média de avaliação: %.2f".formatted(filme1.mediaAvaliacao()));
    }
}
