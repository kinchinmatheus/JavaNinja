package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int maxNinjas = 5;
        int contador = 0;

        Ninja[] Ninjas = new Ninja[maxNinjas];
        Services sistema = new Services();

        while (continuar) {
            System.out.println("Escolha uma opção");
            System.out.println("1- Cadastrar Ninja");
            System.out.println("2- Listar Ninjas");
            System.out.println("3- Atualizar habilidade especiais de Ninjas");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (contador >= maxNinjas) {
                        System.out.println("Não temos espaço para cadastrar um novo Ninja.");
                    } else {
                        System.out.println("Ele é Uchiha?");
                        String Uchiha = sc.nextLine();
                        Ninja ninja;

                        if (Uchiha.equalsIgnoreCase("Sim")) {
                            ninja = new Uchiha();
                        } else {
                            ninja = new Ninja();
                        }
                        System.out.println("Insira o nome do Ninja");
                        ninja.nome = sc.nextLine();
                        System.out.println("Insira a idade do Ninja");
                        ninja.idade = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Insira a Missão");
                        ninja.missao = sc.nextLine();
                        System.out.println("Insira a dificuldade da Missão");
                        ninja.nivelDificuldade = sc.nextLine();
                        System.out.println("Insira o status da Missão");
                        ninja.statusMissao = sc.nextLine();

                        if (ninja instanceof Uchiha) {
                            System.out.println("Qual habilidade especial dele?");
                            ((Uchiha) ninja).habilidadeEspecial = sc.nextLine();
                        }
                        Ninjas[contador] = ninja;
                        contador++;
                    }
                        continuar = sistema.continuarNoSistema();
                        break;

                case 2:
                        if (contador == 0) {
                            System.out.println("Não existe Ninjas cadastrados.");
                        } else {
                            for (int i = 0; i < contador; i++) {
                                Ninjas[i].mostrarInformacoes();
                            }
                        }
                        continuar = sistema.continuarNoSistema();
                        break;

                case 3:
                        if (contador == 0) {
                            System.out.println("Não existe Ninjas cadastrados.");
                        } else {
                            System.out.println("Qual Ninja quer mudar?");
                            String escolha = sc.nextLine();

                            boolean encontrado = false;

                            for (int i = 0; i < contador; i++) {
                                if (Ninjas[i].nome.equalsIgnoreCase(escolha)) {
                                    encontrado = true;

                                if (Ninjas[i] instanceof Uchiha) {
                                    System.out.println("Digite a nova habilidade especial:");
                                    ((Uchiha) Ninjas[i]).habilidadeEspecial = sc.nextLine();
                                    System.out.println("Habilidade atualizada com sucesso.");
                                } else {
                                    System.out.println("Esse Ninja não é Uchiha, então não possui habilidade especial.");
                                }
                                break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Ninja não encontrado.");
                            }
                        }
                        continuar = sistema.continuarNoSistema();
                        break;
                default:
                    System.out.println("Não temos essa opção.");
            }

        }

        sc.close();

    }


}
