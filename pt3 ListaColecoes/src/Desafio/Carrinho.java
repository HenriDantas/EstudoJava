package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho{
    
    private List<Produto> produtos;

    public Carrinho(){
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void colocarNoCarrinho(Produto produto){
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return produtos.toString();
    }
    
}
