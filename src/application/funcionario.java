package application;

public class funcionario {
    private Integer id;
    private String name;
    private double salario;

    public funcionario(int id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void increaseSalary(double percentage) {
        salario += salario * percentage / 100.0;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "name='" + name + '\'' +
                '}';
    }
}
