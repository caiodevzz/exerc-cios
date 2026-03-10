package exerciosP5.deployment;

import exerciosP5.application.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios voce vai cadastrar ? ");

        int n = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("Dados do " + (i + 1) + " funcionario");

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new Funcionario(id , nome , salario));
        }

        sc.nextLine();

        System.out.print("Voce deseja realizqar algum metodo ? ");

        String opcao = sc.nextLine();

        if (opcao.equals("SIM") || opcao.equals("Sim")) {
            System.out.print("Qual metodo voce deseja realizar: Aumento ou Desconto ");
            String opcao2 = sc.nextLine();

            if (opcao2.equals("Aumento") || opcao2.equals("Desconto")) {
                System.out.print("Digite o id do funcionario: ");
                int idopcao = sc.nextInt();

                Funcionario funcionario = null;


                for (Funcionario x : funcionarios) {
                    if (x.getId() == idopcao)
                        funcionario = x;
                    break;
                }

                if (funcionario == null) {
                    System.out.println("Id nao encontrado: ");

                } else if (opcao2.equals("Aumento")) {
                    System.out.print("Digite o valor que voce quer digitar pro aumento: ");

                    double valor = sc.nextDouble();

                    funcionario.increaseSalary(valor);

                }else{
                    System.out.println("Digite o valor do deconto: ");
                    double valor = sc.nextDouble();

                    funcionario.descontoSalario(valor);
                }
            }

            System.out.println("------------------------------------");

        }
        for (Funcionario x : funcionarios) {
            System.out.println(x);
        }
    }
}
