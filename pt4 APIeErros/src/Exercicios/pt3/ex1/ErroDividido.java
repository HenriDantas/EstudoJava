package Exercicios.pt3.ex1;

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
