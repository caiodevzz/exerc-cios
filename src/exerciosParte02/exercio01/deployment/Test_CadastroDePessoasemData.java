package exerciosParte02.exercio01.deployment;
import exerciosParte02.exercio01.aplication.CadastroDePessoasemData;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_CadastroDePessoasemData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Quantas pessoas voce quer cadastrar? : ");
        int quantPessoas = sc.nextInt();
        sc.nextLine();

        List<CadastroDePessoasemData> cadastroDePessoasemData = new ArrayList<>();

        for (int i = 0; i < quantPessoas; i++) {
            System.out.print("Nome do cadastro de pessoa " + (i + 1) + ": ");
            String nome = sc.next();

            sc.nextLine();

            System.out.print("Data de nascimento do cadastro de pessoa : ");
            String dataString = sc.next();

            sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate dataDeNascimento = LocalDate.parse(dataString, dtf);

            cadastroDePessoasemData.add(new CadastroDePessoasemData(nome , dataDeNascimento));

        }

        System.out.println("-------------------------");
        System.out.print("Voce deseja mostrar a data de nascimento de alguns funcionario ? ");

        String opcao = sc.nextLine();

        if (opcao.equals("Sim")) {
            System.out.print("Digite a data do cadastro de pessoa: ");

            String data2 = sc.nextLine();

            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate date2 = LocalDate.parse(data2 , formatter2);

            CadastroDePessoasemData cadastroDePessoasemData1 = null;

            for (CadastroDePessoasemData x : cadastroDePessoasemData) {
                if (x.getDataDeNascimento().equals(date2)) {
                    cadastroDePessoasemData1 = x;
                    break;
                }
            }

            if (cadastroDePessoasemData1 == null) {
                System.out.println("Funcionario nao encontrado!");
            }else {
                System.out.println("------------------------------------");
                System.out.println(cadastroDePessoasemData1.getDataDeNascimento());
            }

        }

    }
}
