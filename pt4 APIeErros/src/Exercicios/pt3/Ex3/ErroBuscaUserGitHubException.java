package Exercicios.pt3.Ex3;

public class ErroBuscaUserGitHubException  extends RuntimeException{
    // private String mensagem;

    // public ErroBuscaUserGitHubException(String mensagem){
    //     this.mensagem = mensagem;
    // }    n precisa acho, ja que n é usado construtor dele

    @Override
    public String getMessage() {
        return "Usuario não encontrado, tente novamente";
    }

}
