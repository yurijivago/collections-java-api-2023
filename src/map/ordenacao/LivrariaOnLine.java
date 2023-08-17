package map.ordenacao;

import java.util.*;

public class LivrariaOnLine {
    //atrinuto
    private Map<String, Livro> livrariaMap;

    public LivrariaOnLine() {
        livrariaMap = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarLivro(String link, Livro livro): Adiciona um livro à livraria, utilizando o ISBN como chave no Map.*/
    public void adicionarLivro(String link, Livro livro){
        livrariaMap.put(link, livro);
    }

    /*removerLivro(String titulo): Remove um livro da livraria, dado o titulo do livro.*/
    public void removerLivro(String titulo){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("A livraria está vazia!");
        Livro livroParaRemover = null;
        for(Map.Entry<String, Livro> livro: livrariaMap.entrySet()){
            if(livro.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livroParaRemover = livro.getValue();
                livrariaMap.remove(livroParaRemover);
                System.out.println("Livro removido com sucesso!");
                break;
            }
        }
        if(livroParaRemover == null)
            System.out.println("Livro não encontrado.");
    }

    /*exibirLivrosOrdenadosPorPreco(): Exibe os livros da livraria em ordem crescente de preço.*/
    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("A livraria está vazia!");
        return new TreeMap<>(livrariaMap);
    }

    /*pesquisarLivrosPorAutor(String autor): Retorna uma lista de todos os livros escritos por um determinado autor.*/
    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("A livraria está vazia!");
        Set<Map.Entry<String, Livro>> livrosPorAutorSet = new TreeSet<>(new ComparatorLivroPorAutor());
        for(Map.Entry<String, Livro> livroSet: livrariaMap.entrySet()){
            livrosPorAutorSet.add(livroSet);
        }

        Map<String, Livro> livrosPorAutorMap = new LinkedHashMap<>();
        for(Map.Entry<String, Livro> livroMap: livrosPorAutorSet){
            livrosPorAutorMap.put(livroMap.getKey(), livroMap.getValue());
        }
        return livrosPorAutorMap;
    }

    /*obterLivroMaisCaro(): Retorna o livro mais caro disponível na livraria.*/
    public Livro obterLivroMaisCaro(){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("A livraria está vazia!");
        Livro livroMaisCaro = null;
        double valorMaisCaro = Double.MIN_VALUE;
        for(Map.Entry<String, Livro> livro: livrariaMap.entrySet()){
            if(livro.getValue().getPreco() > valorMaisCaro){
                livroMaisCaro = livro.getValue();
                valorMaisCaro = livro.getValue().getPreco();
            }
        }
        return livroMaisCaro;
    }

    /*exibirLivroMaisBarato(): Retorna o livro mais barato disponível na livraria.*/
    public Livro exibirLivroMaisBarato(){
        if(livrariaMap.isEmpty())
            throw new RuntimeException("A livraria está vazia!");
        Livro livroMaisBarato = null;
        double valorMaisBarato = Double.MAX_VALUE;
        for(Map.Entry<String, Livro> livro: livrariaMap.entrySet()){
            if(livro.getValue().getPreco() < valorMaisBarato){
                livroMaisBarato = livro.getValue();
                valorMaisBarato = livro.getValue().getPreco();
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnLine livrariaOnline = new LivrariaOnLine();
        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new Livro("1984", "George Orwell",  19.60d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d ));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 26.90d));

        System.out.println("[ Livros por preço ]" + livrariaOnline.exibirLivrosOrdenadosPorPreco());


        System.out.println("[ Livro mais Barato ]" + livrariaOnline.exibirLivroMaisBarato());


        System.out.println("[ Livro mais Caro ]" + livrariaOnline.obterLivroMaisCaro());

    }

}
