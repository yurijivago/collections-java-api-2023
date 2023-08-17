package set.pesquisa;

import java.util.Objects;

public class Contato {
    //atributos
    private String nome;
    private int númeroTelefone;

    public Contato(String nome, int númeroTelefone) {
        this.nome = nome;
        this.númeroTelefone = númeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNúmeroTelefone() {
        return númeroTelefone;
    }

    public void setNúmeroTelefone(int númeroTelefone) {
        this.númeroTelefone = númeroTelefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", númeroTelefone=" + númeroTelefone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
