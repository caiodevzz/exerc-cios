package exerciosP1.aplicacao;

public class Produtos {
    private String nome;
    private Integer id;
    private Double preco;

    public Produtos(String nome, Integer id, Double preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double incrementoPreco(double pocentagem) {
        return preco += preco * pocentagem / 10.0;
    }

    public String toString() {
        return "Nome: " + this.nome + ", preço: R$: " + this.preco;
    }
}
