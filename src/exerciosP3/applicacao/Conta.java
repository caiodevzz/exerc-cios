package exerciosP3.applicacao;

public class Conta {
    private String titular;
    private Integer numero;
    private Double saldo;

    public Conta(String titular, Integer numero, Double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public double ddepositar(double valor) {
        return this.saldo += valor;
    }

    public double sacar(double valor) {
        return this.saldo -= valor;
    }

    @Override
    public String toString() {
        return "Conta " + this.numero + " , Nome: " + this.titular + " : " +String.format("%.2f", this.saldo);
    }
}
