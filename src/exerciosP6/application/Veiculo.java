package exerciosP6.application;

public class Veiculo {
    private int id;
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(int id, String marca, String modelo, int ano) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void atulizarAno(int anoNovo) {
        if (anoNovo >= this.ano) {
            this.ano = anoNovo;
            System.out.println("Atualizado com Sucesso!!");
        }

    }

    public String toString() {
        return "Modelo: " + modelo +
                ", Id: " + id +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Ano: " + ano;
    }
}
