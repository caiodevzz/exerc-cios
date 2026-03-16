package exerciosP6.deployment;

import exerciosP6.application.Veiculo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de veiculos pra cadastrar: ");

        int n = sc.nextInt();

        List<Veiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            System.out.println((i + 1) + " Veiculo: ");

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("ANO: ");
            int ano = sc.nextInt();

            veiculos.add(new Veiculo(id , marca , modelo , ano));
        }
        sc.nextLine();

        System.out.print("Voce deseja Atualizar o ano do seu carro ? ");
        String opc = sc.nextLine();

        if (opc.equals("Sim") || opc.equals("SIM")) {
            System.out.print("Por favor informe o id do carro: ");
            int id = sc.nextInt();

            Veiculo veiculo = null;

            for (Veiculo  x : veiculos) {
                if (x.getId() == id) {
                    veiculo = x;
                    break;
                }
            }

            if (veiculo == null) {
                System.out.println("Veiculo nao encontrado!!");
            } else {
                System.out.print("Digite o ano do veiculo:");
                int ano = sc.nextInt();

                veiculo.atulizarAno(ano);
            }
        }

        System.out.println("-------------------------------------");

        for (Veiculo x : veiculos) {
            System.out.println(x);
        }
    }
}
