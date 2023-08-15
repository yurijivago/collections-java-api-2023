package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributo
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        listaNumeros = new ArrayList<>();
    }

    //métodos a serem implementados
    /*adicionarNumero(int numero): Adiciona um número à lista.*/
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    /*ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.*/
    public List<Integer> ordenarAscendente(){
        if(listaNumeros.isEmpty())
                throw new RuntimeException("A lista está vazia!");

        List<Integer> numerosOrdenadosAscendentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosOrdenadosAscendentes);
        return numerosOrdenadosAscendentes;
    }

    /*ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.*/
    public List<Integer> ordenarDescendente(){
        if(listaNumeros.isEmpty())
            throw new RuntimeException("A lista está vazia!");

        List<Integer> numerosOrdenadosDescendentes = new ArrayList<>(listaNumeros);
        numerosOrdenadosDescendentes.sort(Collections.reverseOrder());
        return numerosOrdenadosDescendentes;
    }

    public void exibirNumeros(){
        if(listaNumeros.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        System.out.println(listaNumeros.toString());
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarAscendente());
        numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());
        numeros.exibirNumeros();
    }
}
