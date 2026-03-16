package exerciosP8.apllication;

public class Celular {
    private int id;
    private  String modelo;
    private  double preco;

    public Celular(int id, String modelo, double preco) {
        this.id = id;
        this.modelo = modelo;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double desconto(double porcentagem) {
        return this.preco += this.preco * porcentagem / 100;
    }

    public void aumentarPreco(double valor) {
        this.preco += valor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                ", Id: " + id +
                ", Preço: " + preco ;
    }
}
