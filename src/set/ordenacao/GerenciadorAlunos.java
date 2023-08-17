package set.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //atributo
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        alunosSet = new HashSet<>();
    }

    //métodos a serem implementados
    /*adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.*/
    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    /*removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.*/
    public void removerAluno(long matricula){
        if(alunosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Aluno alunoParaRemover = null;
        for(Aluno aluno: alunosSet){
            if(aluno.getMatrícula() == matricula){
                alunoParaRemover = aluno;
                alunosSet.remove(alunoParaRemover);
                break;
            }
        }
        if(alunoParaRemover == null)
            System.out.println("Aluno não encontrado!");
    }

    /*exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.*/
    public void exibirAlunosPorNome(){
        if (alunosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }

    /*exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.*/
    public void exibirAlunosPorNota(){
        if (alunosSet.isEmpty())
            throw new RuntimeException("A lista está vazia!");
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunosSet);
        System.out.println(alunosPorNota);
    }

    /*exibirAlunos(): Exibe todos os alunos do conjunto.*/
    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 123456l, 6d);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 1234567l, 8d);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 12345678l, 1d);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 123456789l, 9d);
        System.out.println(gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.removerAluno(000l);
        gerenciadorAlunos.removerAluno(123456789l);
        System.out.println(gerenciadorAlunos.alunosSet);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
