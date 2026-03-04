package exerciosP2.deployment;

import exerciosP2.aplicacao.Aluno;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class AlunoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos vc quer cadastrar ? ");

        int n = sc.nextInt();

        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Aluno: " + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nota: ");
            Double nota = sc.nextDouble();

            alunos.add(new Aluno(id, nome, nota));
        }

        System.out.print("Qual id voce deseja fazer altercacao de nota ?");

        int idAlteracao = sc.nextInt();

        Aluno aluno = null;

        for (Aluno x : alunos) {
            if (x.getId() == idAlteracao) {
                aluno = x;
                break;
            }
        }

        System.out.println("Alteraçao de notas: ");

        double nota = sc.nextDouble();

        if (aluno == null) {
            System.out.println("Aluno nao encontrado");
        } else {
            aluno.alteracaoDeNotas(nota);
        }

        System.out.println("Lista atualizada com as notas: ");

        for (Aluno x : alunos) {
            System.out.println(x);
        }

        System.out.print("Voce deseja remover algum aluno? (Sim/Nao): ");
        String remocao = sc.nextLine();

        if (remocao.equalsIgnoreCase("Sim")) {
            System.out.print("De qual posicao? ");
            int posicao = sc.nextInt();
            sc.nextLine();

            try {
                Aluno removido = alunos.remove(posicao);
                System.out.println("Aluno " + removido + " removido com sucesso!");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Erro: Posicao invalida!");
            }
        }


        System.out.println("Lista atualizada:");
        for (Aluno x : alunos) {
            System.out.println(x);
        }
    }
}
