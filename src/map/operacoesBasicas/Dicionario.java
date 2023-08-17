package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //atributo
    Map<String, String> dicionarioMap;

    public Dicionario() {
        dicionarioMap = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarPalavra(String palavra, String definicao): Adiciona uma palavra e sua definição ao dicionário, associando
      a palavra à sua definição correspondente.*/
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    /*removerPalavra(String palavra): Remove uma palavra do dicionário, dado o termo a ser removido.*/
    public void removerPalavra(String palavra){
        if(dicionarioMap.isEmpty())
            throw new RuntimeException("O dicionário está vazio!");
        dicionarioMap.remove(palavra);
    }

    /*exibirPalavras(): Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.*/
    public void exibirPalavras(){
        if(dicionarioMap.isEmpty())
            throw new RuntimeException("O dicionário está vazio!");
        System.out.println(dicionarioMap);
    }

    /*pesquisarPorPalavra(String palavra): Pesquisa uma palavra no dicionário e retorna sua definição correspondente.*/
    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if(dicionarioMap.isEmpty())
            throw new RuntimeException("O dicionário está vazio!");
        definicao = dicionarioMap.get(palavra);
        if(definicao == null)
            System.out.println("A definição para a palavra '" + palavra + "' não foi encontrada.");
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras
        dicionario.adicionarPalavra("maçã", "Fruta comestível de polpa suculenta e sabor doce.");
        dicionario.adicionarPalavra("casa", "Lugar onde alguém mora.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar uma palavra
        String definicaoMaca = dicionario.pesquisarPorPalavra("maçã");
        System.out.println("Definição da palavra 'maçã': " + definicaoMaca);
        String definicaoUva = dicionario.pesquisarPorPalavra("uva");
        System.out.println("Definição da palavra 'uva': " + definicaoUva);

        // Remover uma palavra
        dicionario.removerPalavra("casa");
        System.out.println("Após remover a palavra 'casa':");
        dicionario.exibirPalavras();
    }
}
