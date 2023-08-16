package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributo
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        palavrasUnicasSet = new HashSet<>();
    }

    //métodos a serem implementados

    /*adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.*/
    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }

    /*removerPalavra(String palavra): Remove uma palavra do conjunto.*/
    public void removerPalavra(String palavra){
        if (palavrasUnicasSet.isEmpty())
                throw new RuntimeException("A lista está vazia!");
        palavrasUnicasSet.remove(palavra);
    }

    /*verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.*/
    public boolean verificarPalavra(String palavra){
        return palavrasUnicasSet.contains(palavra);
    }

    /*exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.*/
    public void exibirPalavrasUnicas(){
        if (palavrasUnicasSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        System.out.println(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Palavra 5");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
