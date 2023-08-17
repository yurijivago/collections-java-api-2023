package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    //atributo
    private String nome;
    private long codigo;
    private double preço;
    private int quantidade;

    public Produto(String nome, long codigo, double preço, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCod() {
        return codigo;
    }

    public double getPreço() {
        return preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + codigo +
                ", preço=" + preço +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
}


class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2) {
        return Double.compare(produto1.getPreço(), produto2.getPreço());
    }
}