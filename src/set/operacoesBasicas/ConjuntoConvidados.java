package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<>();
    }

    //métodos a serem implementados
    /*adicionarConvidado(String nome, int codigoConvite): Adiciona um convidado ao conjunto.*/
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    /*removerConvidadoPorCodigoConvite(int codigoConvite): Remove um convidado do conjunto com base no código do convite.*/
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        if (convidadosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");

        Convidado convidadoParaSerRemovido = null;

        for (Convidado convidado : convidadosSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaSerRemovido = convidado;
                break;
            }
        }
        if (convidadoParaSerRemovido == null) {
            System.out.println("Não existe nenhum convidado com o código de convite '" + codigoConvite + "'.");
        } else {
            convidadosSet.remove(convidadoParaSerRemovido);
        }
    }

    /*contarConvidados(): Conta o número total de convidados no Set.*/
    public int contarConvidados(){
        return convidadosSet.size();
    }

    /*exibirConvidados(): Exibe todos os convidados do conjunto.*/
    public void exibirConvidados(){
        if(convidadosSet.isEmpty())
            throw new RuntimeException("A lista está vazia, logo não há nenhum convidado a ser exibido.");
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
