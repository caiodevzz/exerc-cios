package exerciosP3.deploymente;

import exerciosP1.aplicacao.Produtos;
import exerciosP3.applicacao.Conta;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class TesteConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas contas voce deseja cadastrar ? ");

        int n = sc.nextInt();

        List<Conta> contas = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("Clinte: " + (i + 1));

            System.out.print("Numero da conta: ");
            int numero = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome/Titular: ");
            String titular = sc.nextLine();

            System.out.print("Salddo da conta: ");
            double saldo = sc.nextDouble();

            contas.add(new Conta(titular , numero , saldo));

        }

        System.out.print("Voce deseja realizar algum metodo ? ");

        sc.nextLine();
        String opcao = sc.nextLine();

        if (opcao.equals("Sim") || opcao.equals("SIM")) {
            System.out.print("SACAR OU DEPOSITAR ? ");

            String opcao2 = sc.nextLine();

            if (opcao2.equals("Depositar") || opcao2.equals("Sacar")) {
                System.out.print("Numero ca conta: ");

                int numeroDaConta = sc.nextInt();

                Conta conta = null;

                for (Conta x : contas) {
                    if (x.getNumero() == numeroDaConta) {
                        conta = x;
                        break;
                    }
                }
                    if (conta == null) {
                        System.out.println("Numero da conta  nao encontrado");

                    }else if (opcao2 == "Depositar"){
                        System.out.print("Qual seria o valor ? ");
                        double valor = sc.nextDouble();

                        conta.ddepositar(valor);
                    }else {
                        System.out.println("Qual seria o valor do saque ?");
                        double valor = sc.nextDouble();

                        conta.sacar(valor);
                    }

                    for (Conta x : contas) {
                        System.out.println(x);
                    }


        }
    }
    }
}
