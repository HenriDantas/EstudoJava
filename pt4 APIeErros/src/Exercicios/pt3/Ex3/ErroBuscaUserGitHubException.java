package Exercicios.pt3.Ex3;

public class ErroBuscaUserGitHubException  extends RuntimeException{
    private String mensagem;

    // public ErroConsultaGitHubException(String mensagem) {
    //     super(mensagem);
    // } na correção do professor ele fez assim, seria mesma coisa doq o meu construtor?

    public ErroBuscaUserGitHubException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return "Usuario não encontrado, tente novamente";
    }

}
