package exerciosP5.application;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(Integer id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double increaseSalary(double porcentagem) {
      return this.salario += this.salario * porcentagem / 100;
    }

    public double descontoSalario(double valor) {
        return this.salario -= valor;
    }

    public String toString() {
        return "Nome: " + nome +
                ", Id: " + id +
                ", Salario: " + salario;
    }
}
