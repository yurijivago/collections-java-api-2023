package set.pesquisa;

public class Tarefa {
    //atributos
    private String descrição;
    private boolean isConcluída;

    public Tarefa(String descrição, boolean isConcluída) {
        this.descrição = descrição;
        this.isConcluída = isConcluída;
    }

    public String getDescrição() {
        return descrição;
    }

    public boolean isConcluída() {
        return isConcluída;
    }

    public void marcarTarefaConcluida(){
        isConcluída = true;
    }

    public void marcarTarefaPendente(){
        isConcluída = false;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descrição='" + descrição + '\'' +
                ", isConcluída=" + isConcluída +
                '}';
    }


}
