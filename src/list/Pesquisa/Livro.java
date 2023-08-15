package list.Pesquisa;

public class Livro {
    //atributos
    public String título;
    public String autor;
    public int ano;

    public Livro(String título, String autor, int ano) {
        this.título = título;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
