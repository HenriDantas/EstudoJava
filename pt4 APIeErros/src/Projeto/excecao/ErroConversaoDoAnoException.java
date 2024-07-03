package Projeto.excecao;

public class ErroConversaoDoAnoException extends RuntimeException{
    private String mensagem;
    
    public ErroConversaoDoAnoException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
