package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    /*adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista com a descrição fornecida.*/
    public void adicionarTerefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    /*removerTarefa(String descricao): Remove uma tarefa da lista com base em sua descrição.*/
    public void removerTerefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (tarefaList.isEmpty()) {
            System.out.println("A lista está vazia, logo não pode ter nenhum item excluído.");
        } else {
            for(Tarefa tarefa: tarefaList){
                if(tarefa.getDescricao().equals(descricao))
                    tarefasParaRemover.add(tarefa);
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    /*obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.*/
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    /*obterDescricoesTarefas(): Retorna uma lista contendo a descrição de todas as tarefas na lista.*/
    public void obterDescricoesTarefas(){
        if (tarefaList.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        }
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTerefa("Tarefa 01");
        listaTarefa.adicionarTerefa("Tarefa 02");
        listaTarefa.adicionarTerefa("Tarefa 01");

        listaTarefa.obterDescricoesTarefas();
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTerefa("Tarefa 01");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

    }

}

