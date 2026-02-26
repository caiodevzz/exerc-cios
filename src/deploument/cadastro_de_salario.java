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
            sc.nextLine();
            String name = sc.nextLine();


            System.out.print("Salario: ");
            double salario = sc.nextDouble();

            funcionarios.add(new funcionario(id , name , salario));

        }

        System.out.print("Insira o ID do funcionario que tera aumento salarial: ");

        int altercao = sc.nextInt() ;


       funcionario func = null;

       for (funcionario x : funcionarios) {
           if (x.getId() == altercao) {
               func = x;
               break;
           }
       }



        System.out.print("Insira o aumento da porsetagem do salario: ");

        double aumento = sc.nextDouble();

        if (func == null) {
            System.out.println("Id nao encontrado");
        }else {
            func.increaseSalary(aumento);
        }

        System.out.println("Lista com funcionarios com aumento: ");



            for (funcionario x : funcionarios) {
                System.out.println(x);
            }



        }
    }

