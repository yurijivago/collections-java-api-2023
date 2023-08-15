package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    List<Item> listaDeItens;

    public CarrinhoDeCompras(){
        listaDeItens = new ArrayList<>();
    }

    //métodos a serem implementados
    /* adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome,
                                                                preço e quantidade especificados.*/
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    /* removerItem(String nome): Remove um item do carrinho com base no seu nome.*/
    public void removerItem(String nome) {
        List<Item> itensPareSeremRemovidos = new ArrayList<>();
        if (listaDeItens.isEmpty()) {
            System.out.println("A lista está vazia, logo não pode ter nenhum item excluído.");
        } else {
            for (Item item : listaDeItens) {
                if (item.getNome().equalsIgnoreCase(nome))
                    itensPareSeremRemovidos.add(item);
            }
            listaDeItens.removeAll(itensPareSeremRemovidos);
        }
    }

    /* calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço
                            e a quantidade de cada item.*/
    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (listaDeItens.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }

        for (Item item : listaDeItens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }


        return valorTotal;

    }

    /* exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e
                      quantidades.*/
    public void exibirItens() {
        if (listaDeItens.isEmpty()) {
            System.out.println("A lista está vazia, logo não há item a ser exibido.");

        } else {
            for (Item item : listaDeItens) {
                System.out.println(listaDeItens);
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
