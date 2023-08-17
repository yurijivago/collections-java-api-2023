package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    //métodos a serem implementados
    /*adicionarContato(String nome, Integer telefone): Adiciona um contato à agenda, associando o nome do contato ao
     número de telefone correspondente.*/
    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome, telefone);
    }

    /*removerContato(String nome): Remove um contato da agenda, dado o nome do contato.*/
    public void removerContato(String nome){
        if(agendaContatos.isEmpty())
            throw new RuntimeException("A agenda não possui nenhum contato!");
        agendaContatos.remove(nome);
    }

    /*exibirContatos(): Exibe todos os contatos da agenda, mostrando o nome e o número de telefone de cada contato.*/
    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    /*pesquisarPorNome(String nome): Pesquisa um contato pelo nome e retorna o número de telefone correspondente.*/
    public Integer pesquisarPorNome(String nome){
        Integer telefoneRetorno = null;
        if(agendaContatos.isEmpty())
            throw new RuntimeException("A agenda não possui nenhum contato!");
        telefoneRetorno = agendaContatos.get(nome);
        if(telefoneRetorno == null)
            System.out.println("Contato não encontrado!");
        return telefoneRetorno;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}
