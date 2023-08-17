package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributo
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        produtosSet = new HashSet<>();
    }

    //métodos a serem implementados
    /*adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.*/
    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        produtosSet.add(new Produto(nome, cod, preco, quantidade));
    }

    /*exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.*/
    public Set<Produto> exibirProdutosPorNome(){
        if(produtosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    /*exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.*/
    public Set<Produto> exibirProdutosPorPreco(){
        if(produtosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto 5", 1L, 15d, 5);
        cadastroProdutos.adicionarProduto("Produto 0", 2L, 20d, 10);
        cadastroProdutos.adicionarProduto( "Produto 3", 1L,10d, 2);
        cadastroProdutos.adicionarProduto("Produto 9", 9L, 2d, 2);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
