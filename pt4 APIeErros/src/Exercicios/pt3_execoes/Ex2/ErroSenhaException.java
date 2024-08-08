package Exercicios.pt3_execoes.Ex2;

public class ErroSenhaException extends RuntimeException {
    public String menssagem;

    public ErroSenhaException(String mensagem){
        this.menssagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.menssagem;
    }
}
