package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    //atributo
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        listaPessoas = new ArrayList<>();
    }

    //métodos a serem implementados
    /*adicionarPessoa(String nome, int idade, double altura): Adiciona uma pessoa à lista.*/
    public void adicionarPessoa(String nome, int idade, double altura) {
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    /*ordenarPorIdade(): Ordena as pessoas da lista por idade usando a interface Comparable.*/
    public List<Pessoa> ordenarPorIdade() {
        if (listaPessoas.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    /*ordenarPorAltura(): Ordena as pessoas da lista por altura usando um Comparator personalizado.*/
    public List<Pessoa> ordenarPorAltura(){
        if (listaPessoas.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura);
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.listaPessoas);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());

        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
