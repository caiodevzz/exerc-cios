package exerciosP7.application;

public class Jogo {
    private int id;
    private String nome;
    private int HorasJogadas;

    public Jogo(int id, String nome, int horasJogadas) {
        this.id = id;
        this.nome = nome;
        HorasJogadas = horasJogadas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasJogadas() {
        return HorasJogadas;
    }

    public void setHorasJogadas(int horasJogadas) {
        HorasJogadas = horasJogadas;
    }

    public int addHoras(int horas) {
        return HorasJogadas += horas;
    }


}
