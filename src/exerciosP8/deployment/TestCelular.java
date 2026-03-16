package exerciosP8.deployment;

import exerciosP8.apllication.Celular;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class TestCelular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos celulares voce deseja cadastrar ? ");

        int n = sc.nextInt();

        List<Celular> celulares = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("Dados do " + (i + 1) + " :");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.println("Preço: ");
            double preco = sc.nextDouble();

            celulares.add(new Celular(id , modelo , preco));
        }
        sc.nextLine();

        System.out.println("Voce quer realizar algum procedimento no seu celular ? ");
        String opc = sc.nextLine();


        if (opc.equals("Sim") || opc.equals("SIM")) {
            System.out.print("Digite o id: ");
            int id = sc.nextInt();

            Celular celular = null;

            for (Celular x : celulares) {
                if (x.getId() == id) {
                    celular = x;
                    break;
                }
            }
            System.out.println("TABELA: " +
                    "1 Descontos " +
                    "2 Aumentar preço do celular " +
                    "Escolha um: ");

            int opc2 = sc.nextInt();


            if (celular == null) {
                System.out.println("ID nao encontrado!!");
            } else if (opc2 == 1) {
                System.out.print("Quantos de descontos voce quer ? ");
                double desconto = sc.nextDouble();

                celular.desconto(desconto);
            }else {
                System.out.print("Par quantos voce deseja aumentar o preço ? ");
                double preco = sc.nextDouble();

                celular.aumentarPreco(preco);
            }

            for (Celular x : celulares) {
                System.out.println(x);
            }

        }
    }
}
