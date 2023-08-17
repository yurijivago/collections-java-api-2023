package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo
    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() {
        palavrasMap = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarPalavra(String palavra, Integer contagem): Adiciona uma palavra à contagem.*/
    public void adicionarPalavra(String palavra, Integer contagem){
        palavrasMap.put(palavra, contagem);
    }

    /*removerPalavra(String palavra): Remove uma palavra da contagem, se estiver presente.*/
    public void removerPalavra(String palavra){
        if(palavrasMap.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        palavrasMap.remove(palavra);
    }

    /*exibirContagemPalavras(): Exibe todas as palavras e suas respectivas contagens.*/
    public void exibirContagemPalavras(){
        if(palavrasMap.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        System.out.println(palavrasMap);
    }

    /*encontrarPalavraMaisFrequente(): Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.*/
    public String encontrarPalavraMaisFrequente(){
        if(palavrasMap.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        String strPalavraContagem = null;
        int frequenciaPalavra = 0;
        for(Map.Entry<String, Integer> listaPalavras: palavrasMap.entrySet()){
            if(listaPalavras.getValue() >= frequenciaPalavra){
                frequenciaPalavra = listaPalavras.getValue();
                strPalavraContagem = "Palavra mais frequente\nPalavra: " + listaPalavras.getKey()
                        + " - Contagem: " + listaPalavras.getValue();            }
        }
        return strPalavraContagem;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Palavra 1", 2);
        contagemPalavras.adicionarPalavra("Palavra 2", 8);
        contagemPalavras.adicionarPalavra("Palavra 3", 1);
        contagemPalavras.adicionarPalavra("Palavra 4", 6);

        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
