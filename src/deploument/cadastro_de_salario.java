package deploument;

import application.funcionario;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class cadastro_de_salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanros funcionarios vc quer registar ? ");

        int n = sc.nextInt();
        List<funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n ; i++) {

            System.out.println("Funcionario " + " #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            String name = sc.nextLine();
            sc.nextLine();

            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(0 , new funcionario(id , name , salario));

        }

        System.out.print("Insira o ID do funcionario que tera aumento salarial: ");

        int altercao = sc.nextInt();

        funcionarios.indexOf(altercao);

        System.out.print("Insira o aumento da porsetagem do salario: ");

        }
    }

