package Exercicios.pt3_execoes.Ex2;

public class ValidarSenha {
    
    public ValidarSenha(String senha){
        String mensagem = "";
        if(senha.length() < 8 ){
            mensagem += "Menor que o necessario\n";
        }
        if(!senha.contains("!") || !senha.contains("?") || !senha.contains("@") || !senha.contains("$")
            || !senha.contains("%") || !senha.contains("&") || !senha.contains("*") || !senha.contains("(") || !senha.contains(")") ){
                mensagem += "Não possui caracteres especiais\n";
        }

        if(mensagem != null){
            throw new ErroSenhaException("Senha inválida: " + mensagem);
        }
    }

}
