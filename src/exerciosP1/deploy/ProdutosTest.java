package exerciosP1.deploy;

import exerciosP1.aplicacao.Produtos;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class ProdutosTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos produtos vc vai querer cadastrar ? ");

        int n = sc.nextInt();
        List<Produtos> produtos = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println("Produto: " + " #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            produtos.add(new Produtos(nome , id , preco));
        }


        System.out.print("Insira o id do produto que vc quer alterar o preco: ");

        int idAlteracao = sc.nextInt();

        Produtos produ = null;

        for (Produtos x : produtos) {
            if (x.getId() == idAlteracao) {
                produ = x;
                break;
            }

        }


        System.out.print("Alterçao de preco: ");

        double preco = sc.nextDouble();

        if (produ == null) {
            System.out.println("Id nao encontrado");
        }else {
            produ.incrementoPreco(preco);
        }

        System.out.println("Lista dos produtos com preço alterado: ");

        for (Produtos x : produtos) {
            System.out.println(x);
        }


    }
}
