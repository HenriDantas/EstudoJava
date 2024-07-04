package Exercicios.pt3.Ex2;

public class ValidarSenha {
    
    public ValidarSenha(String senha){
        if(senha.length() < 8 ){
            throw new ErroSenhaException("Senha inseria inválida, menor que o necessario");
        }
        if(!senha.contains("!") || !senha.contains("?") || !senha.contains("@") || !senha.contains("$")
            || !senha.contains("%") || !senha.contains("&") || !senha.contains("*") || !senha.contains("(") || !senha.contains(")") ){
            throw new ErroSenhaException("Senha inseria inválida, não possui caracteres especiais");
        }

    }

}
