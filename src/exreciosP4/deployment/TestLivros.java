package exreciosP4.deployment;

import exreciosP4.aplication.Livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestLivros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos livros vc deseja adicionar no sistema ? ");

        int n = sc.nextInt();

        List<Livros> livros = new ArrayList<>();


        for (int i = 0; i < n ; i++) {
            System.out.println(( i + 1 ) + "Livro");

            System.out.print("Id: ");
            int idDoLivro = sc.nextInt();
            sc.nextLine();

            System.out.print("Titulo: ");
            String titulo= sc.nextLine();

            System.out.print("Quantidade em estoque: ");
            int quantidadeDoLivro = sc.nextInt();

            livros.add(new Livros(idDoLivro , titulo , quantidadeDoLivro));
        }

        System.out.print("Voce quer aumentar ou diminuir a quantidade dos livros: ");

        sc.nextLine();
        String opcao = sc.nextLine();

        if (opcao.equals("Aumentar") || opcao.equals("Diminuir")) {

            System.out.print("Colque o id: ");
            int id = sc.nextInt();

            Livros livro = null;

            for (Livros x : livros) {
                if (x.getId() == id) {
                    livro = x;
                    break;
                }
            }

            if (livro == null) {
                System.out.println("Id nao encontrado");

            } else if (opcao.equals("Aumentar")) {
                System.out.print("Digite o valor da quantidade: ");
                int quantidade = sc.nextInt();

                livro.addLivros(quantidade);
            }else {
                System.out.print("Digite o valor que vc quer diminuir na quantidade: ");
                int quantidade = sc.nextInt();

                livro.romveLivros(quantidade);
            }
        }
        for (Livros x : livros) {
            System.out.println(x);
        }

    }
}
