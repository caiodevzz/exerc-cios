package exerciosParte02.exercio02.deployment;

import exerciosParte02.exercio02.application.SistemaDeContaBancarioComHistorico;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_SistemaDeContaBancarioComHistorico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<SistemaDeContaBancarioComHistorico> contas = new ArrayList<>();

        System.out.print("Você quer criar uma conta? ");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("sim")) {

            System.out.print("Informe seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Informe seu CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Saldo em mãos: ");
            double saldo = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            // adiciona na lista
            contas.add(new SistemaDeContaBancarioComHistorico(cpf, nome, saldo));

            System.out.print("Você deseja depositar mais dinheiro? ");
            String opcao2 = sc.nextLine();

            if (opcao2.equalsIgnoreCase("sim")) {

                System.out.print("Informe seu CPF: ");
                String cpfBusca = sc.nextLine();

                System.out.print("Informe a quantia que deseja depositar: ");
                double deposito = sc.nextDouble();

                SistemaDeContaBancarioComHistorico contaEncontrada = null;

                // busca na lista
                for (SistemaDeContaBancarioComHistorico conta : contas) {
                    if (conta.getCpf().equals(cpfBusca)) {
                        contaEncontrada = conta;
                        break;
                    }
                }

                if (contaEncontrada != null) {
                    contaEncontrada.depositar(deposito);
                    System.out.println("Depósito realizado com sucesso!");
                } else {
                    System.out.println("Conta não encontrada.");
                }
            }

            System.out.println("Operação finalizada.");
        }

        sc.close();
    }
}