package Exercicios.pt3_execoes.Ex1;

public class ErroDividido extends RuntimeException{
    private String menssagem;

    public  ErroDividido(String mensagem){
        this.menssagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.menssagem;
    }
}
