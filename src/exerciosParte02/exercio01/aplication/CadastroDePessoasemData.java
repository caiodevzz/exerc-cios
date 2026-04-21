package exerciosParte02.exercio01.aplication;

import java.time.LocalDate;

public class CadastroDePessoasemData {
    private String nome;
    private LocalDate dataDeNascimento;
    public static int contadorPessoas = 0;

        public CadastroDePessoasemData(String nome) {
            this.nome = nome;
            contadorPessoas++;
        }


    public CadastroDePessoasemData(String nome, LocalDate dataDeNascimento) {
            this.nome = nome;
            this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public static int getContadorPessoas() {
        return contadorPessoas;
    }

    public static void setContadorPessoas(int contadorPessoas) {
        CadastroDePessoasemData.contadorPessoas = contadorPessoas;
    }
}
