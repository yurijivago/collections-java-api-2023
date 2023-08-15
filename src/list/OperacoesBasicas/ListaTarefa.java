package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTerefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTerefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa tarefa: tarefaList){
            if(tarefa.getDescricao().equals(descricao))
                tarefasParaRemover.add(tarefa);
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
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

