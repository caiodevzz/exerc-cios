package exreciosP4.aplication;

public class Livros {
    private int id;
    private String titulo;
    private int quantidade;

    public Livros(Integer id, String titulo, Integer quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int addLivros(int quantidade) {
      return quantidade += this.quantidade;
    }

    public int romveLivros(int quantidade) {
        return this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                ", Id: " + id +
                ", Quantidade: " + quantidade;
    }
}

