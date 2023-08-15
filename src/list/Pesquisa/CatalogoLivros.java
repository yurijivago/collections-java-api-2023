package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    List<Livro> catalogoLivros;

    public CatalogoLivros(){
        catalogoLivros = new ArrayList<>();
    }

    //métodos a serem implementados
    /*adicionarLivro(String titulo, String autor, int anoPublicacao): Adiciona um livro ao catálogo.*/
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    /*pesquisarPorAutor(String autor): Pesquisa livros por autor e retorna uma lista com os livros encontrados.*/
    public List<Livro> pesquisarPorAutor(String autor){
        if(catalogoLivros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }

        List<Livro> livrosPorAutor = new ArrayList<>();
        for(Livro livro: catalogoLivros){
            if(livro.getAutor().equalsIgnoreCase(autor));
                livrosPorAutor.add(livro);
        }
        return livrosPorAutor;
    }

    /*pesquisarPorIntervaloAnos(int anoInicial, int anoFinal): Pesquisa livros publicados em um determinado intervalo
                                                            de anos e retorna uma lista com os livros encontrados.*/
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        if(catalogoLivros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }

        List<Livro> livrosPorPeriodo = new ArrayList<>();
        for(Livro livro: catalogoLivros){
            if(livro.getAno() >= anoInicial && livro.getAno() <= anoFinal)
                livrosPorPeriodo.add(livro);
        }
        return livrosPorPeriodo;
    }

    /*pesquisarPorTitulo(String titulo): Pesquisa livros por título e retorna o primeiro livro encontrado.*/
    public Livro pesquisarPorTitulo(String titulo){
        if(catalogoLivros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }
        for(Livro livro:catalogoLivros){
            if (livro.getTítulo().equalsIgnoreCase(titulo))
                return livro;
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
