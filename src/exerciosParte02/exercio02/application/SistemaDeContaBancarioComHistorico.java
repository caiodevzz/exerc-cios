package exerciosParte02.exercio02.application;

import java.util.ArrayList;

public class SistemaDeContaBancarioComHistorico {
    private String Cpf;
    public String nome;
    private Double saldo;

    public SistemaDeContaBancarioComHistorico(String cpf, String nome, Double saldo) {
        Cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        this.Cpf = cpf;
    }


    public double depositar (double valor) {
          return valor += this.saldo;
    }

    public double sacar (double valor) {
        return this.saldo -= valor;
    }
}
