package NivelFacil.Exercicios;

import java.util.Scanner;

public class AdminDoServidor {

//    Cenário: Você está simulando um menu simples de administração de um servidor (como em jogos tipo Minecraft).
//    O usuário deve digitar um número para executar um comando. Requisitos:
//
//    Exiba um menu: "1 - Kick", "2 - Ban", "3 - Mute".
//
//    Use um Scanner para ler a opção.
//
//    Use o switch para imprimir a ação correspondente (ex: "Jogador expulso do servidor").
//
//    Adicione um default para "Comando desconhecido".

        static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("1- Kick | 2- Ban | 3- Mute");

        int escolhaDoUsuario = sc.nextInt();

        String motivo = switch (escolhaDoUsuario) {
            case 1 -> "Você kickou o jogador!";
            case 2 -> "Você baniu o jogador!";
            case 3 -> "Você mutou o jogador!";
            default -> "Comando desconhecido.";
        };

            System.out.println(motivo);

             sc.close();
    }
}