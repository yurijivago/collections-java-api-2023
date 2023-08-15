package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    //métodos a serem implementados
    /*adicionarNumero(int numero): Adiciona um número à lista de números.*/
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    /*calcularSoma(): Calcula a soma de todos os números na lista e retorna o resultado.*/
    public int calcularSoma(){
        if(listaNumeros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }

        int soma = 0;
        for(Integer numero: listaNumeros){
            soma += numero;
        }
        return soma;
    }


    /*encontrarMaiorNumero(): Encontra o maior número na lista e retorna o valor.*/
    public int encontrarMaiorNumero(){
        if(listaNumeros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }

        int maior = Integer.MIN_VALUE;
        for(Integer numero: listaNumeros){
            if(numero > maior)
                maior = numero;
        }
        return maior;
    }


    /*encontrarMenorNumero(): Encontra o menor número na lista e retorna o valor.*/
    public int encontrarMenorNumero(){
        if(listaNumeros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }
        int menor = Integer.MAX_VALUE;
        for(Integer numero: listaNumeros){
            if(numero < menor)
                menor = numero;
        }
        return menor;
    }


    /*exibirNumeros(): Retorna uma lista contendo todos os números presentes na lista.*/
    public void exibirNumeros(){
        if(listaNumeros.isEmpty()){
            throw new RuntimeException("A lista está vazia!");
        }
        System.out.println(listaNumeros.toString());
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
