package set.pesquisa;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //atributo
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new HashSet<>();
    }

    //métodos a serem implementados
    /*adicionarTarefa(Tarefa tarefa): Adiciona uma nova tarefa ao Set.*/
    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    /*removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente.*/
    public void removerTarefa(String descricao) {
        if (listaTarefas.isEmpty())
            throw new RuntimeException("A lista está vazia");
        Tarefa tarefaRemovida = null;
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescrição().equalsIgnoreCase(descricao)) {
                tarefaRemovida = tarefa;
                listaTarefas.remove(tarefa);
                break;
            }
        }
        if(tarefaRemovida == null)
            System.out.println("Tarefa não encontrada.");
    }

    /*exibirTarefas(): Exibe todas as tarefas da lista de tarefas.*/
    public void exibirTarefas() {
        System.out.println(listaTarefas);
    }

    /*contarTarefas(): Conta o número total de tarefas na lista de tarefas.*/
    public int contarTarefas() {
        return listaTarefas.size();
    }

    /*obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.*/
    public Set<Tarefa> obterTarefasConcluidas() {
        if (listaTarefas.isEmpty())
            throw new RuntimeException("A lista está vazia");
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluída())
                tarefasConcluidas.add(tarefa);
        }
        return tarefasConcluidas;
    }

    /*obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.*/
    public Set<Tarefa> obterTarefasPendentes() {
        if (listaTarefas.isEmpty())
            throw new RuntimeException("A lista está vazia");
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : listaTarefas) {
            if (!tarefa.isConcluída())
                tarefasPendentes.add(tarefa);
        }
        return tarefasPendentes;
    }

    /*marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.*/
    public void marcarTarefaConcluida(String descricao) {
        if (listaTarefas.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescrição().equalsIgnoreCase(descricao)) {
                tarefa.marcarTarefaConcluida();
                break;
            }
        }
    }

    /*marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.*/
    public void marcarTarefaPendente(String descricao) {
        if (listaTarefas.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getDescrição().equalsIgnoreCase(descricao)) {
                tarefa.marcarTarefaPendente();
                break;
            }
        }
    }

    /*limparListaTarefas(): Remove todas as tarefas da lista de tarefas.*/
    public void limparListaTarefas() {
        listaTarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 1", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 2", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 3", false));
        listaTarefas.adicionarTarefa(new Tarefa("Tarefa 4", false));
        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Tarefa 55");
        listaTarefas.exibirTarefas();

        System.out.println("Existem " + listaTarefas.contarTarefas() + " na lista de tarefas.");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa 2");
        listaTarefas.marcarTarefaConcluida("Tarefa 1");
        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }


}
