package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    //atributo
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        estoqueProdutosMap = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarProduto(long cod, String nome, int quantidade, double preco): Adiciona um produto ao estoque,
                                                                   juntamente com a quantidade disponível e o preço.*/
    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    /*exibirProdutos(): Exibe todos os produtos, suas quantidades em estoque e preços.*/
    public void exibirProdutos() {
        if (estoqueProdutosMap.isEmpty())
            throw new RuntimeException("O estoque está vazio!");
        System.out.println(estoqueProdutosMap);
    }

    /*calcularValorTotalEstoque(): Calcula e retorna o valor total do estoque, considerando a quantidade e
                                   o preço de cada produto.*/
    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (estoqueProdutosMap.isEmpty())
            throw new RuntimeException("O estoque está vazio!");
        for (Produto produto : estoqueProdutosMap.values()) {
            valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
        }
        return valorTotalEstoque;
    }

    /*obterProdutoMaisCaro(): Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.*/
    public Produto obterProdutoMaisCaro() {
        if (estoqueProdutosMap.isEmpty())
            throw new RuntimeException("O estoque está vazio!");
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                maiorPreco = produto.getPreco();
                produtoMaisCaro = produto;
            }
        }
        return produtoMaisCaro;
    }

    /*obterProdutoMaisBarato(): Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.*/
    public Produto obterProdutoMaisBarato() {
        if (estoqueProdutosMap.isEmpty())
            throw new RuntimeException("O estoque está vazio!");
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() < menorPreco) {
                menorPreco = produto.getPreco();
                produtoMaisBarato = produto;
            }
        }
        return produtoMaisBarato;
    }

    /*obterProdutoMaiorQuantidadeValorTotalNoEstoque(): Retorna o produto que está em maior quantidade no estoque,
                                                considerando o valor total de cada produto (quantidade * preço).*/
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        if (estoqueProdutosMap.isEmpty())
            throw new RuntimeException("O estoque está vazio!");
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double quantidadeValor = Double.MIN_VALUE;
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco()*produto.getPreco() > quantidadeValor) {
                quantidadeValor = produto.getPreco()*produto.getPreco();
                produtoMaiorQuantidadeValorTotalNoEstoque = produto;
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L, "Produto A", 1, 50.0);
        estoque.adicionarProduto(2L, "Produto B", 5, 11.0);
        estoque.adicionarProduto(3L, "Produto C", 3, 10.0);
        estoque.adicionarProduto(3L, "Produto D", 2, 4.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto com maior quantidade em valor no estoque: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
