package map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro implements Comparable<Livro>{
    //atributos
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Livro livro) {
        return Double.compare(getPreco(), livro.getPreco());
    }
}


class ComparatorLivroPorAutor implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getAutor().compareToIgnoreCase(livro2.getValue().getAutor());
    }
}