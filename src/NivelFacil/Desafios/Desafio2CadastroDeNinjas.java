package NivelFacil.Desafios;

import java.util.Scanner;

public class Desafio2CadastroDeNinjas {
    static void main() {

        int ninjasMAX = 10;
        Scanner sc = new Scanner(System.in);
        String[] nomeDosNinjas = new String[ninjasMAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Adicionado para consumir a nova linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < ninjasMAX) {
                        System.out.println("Digite o Ninja a ser cadastrado:");
                        String nomeNinja = sc.nextLine();
                        nomeDosNinjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso.");
                    } else {
                        System.out.println("Número máximo de ninjas já cadastrado.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("--- Lista de Ninjas ---");
                        for (int i = 0; i < nomeDosNinjas.length; i++) {
                            System.out.println(nomeDosNinjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
                sc.close();
    }
}
