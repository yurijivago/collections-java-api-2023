package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    //métodos a serem implementados
    /*adicionarContato(String nome, int numero): Adiciona um contato à agenda.*/
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    /*exibirContatos(): Exibe todos os contatos da agenda.*/
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    /*pesquisarPorNome(String nome): Pesquisa contatos pelo nome e retorna uma conjunto com os contatos encontrados.*/
    public Set<Contato> pesquisarPorNome(String nome){
        if(contatoSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato: contatoSet){
            if(contato.getNome().startsWith(nome))
                contatosPorNome.add(contato);
        }
        return contatosPorNome;
    }

    /*atualizarNumeroContato(String nome, int novoNumero): Atualiza o número de telefone de um contato específico*/
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        if(contatoSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNúmeroTelefone(novoNumero);
                contatoAtualizado = contato;
                System.out.println("Número de telefone atualizado com sucesso!");
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));

        agendaContatos.exibirContatos();
    }
}
