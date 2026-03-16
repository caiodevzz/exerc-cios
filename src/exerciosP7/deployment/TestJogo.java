package exerciosP7.deployment;

import exerciosP7.application.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestJogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Numero de jogos pra cadastrar: ");

            int n = sc.nextInt();

        List<Jogo> jogos = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            System.out.println("Dados do " + (i + 1) + " jogo: ");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Horas jogadas: ");
            int HorasJogadas = sc.nextInt();

            jogos.add(new Jogo(id , nome , HorasJogadas));
        }
        sc.nextLine();

        System.out.println("Voce deseja adicionar horas jogadas ? ");
        String opc = sc.nextLine();

        if (opc.equals("Sim") || opc.equals("SIM")) {
            System.out.println("Por favor informe o id do jogo: ");
            int id = sc.nextInt();

            Jogo jogo = null;

            for (Jogo  x : jogos) {
                if (x.getId() == id) {
                    jogo = x;
                    break;
                }
            }

            if (jogo == null) {
                System.out.println("Jogo nao encontrado!!");
            } else {
                System.out.print("Digite as horas jogadas: ");
                int horas = sc.nextInt();
                jogo.addHoras(horas);
                System.out.println("Horas atualizadas com Sucesso!!");
            }
        }
    }
}
