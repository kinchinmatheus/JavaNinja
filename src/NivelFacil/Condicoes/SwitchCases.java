package NivelFacil.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1) Naruto");
        System.out.println("2) Sasuke");
        System.out.println("3) Sakura");

        int escolhaDoUsuario = sc.nextInt();

        String personagem = switch (escolhaDoUsuario) {
            case 1 -> "Usuário escolheu o Naruto";
            case 2 -> "Usuário escolheu o Sasuke";
            case 3 -> "Usuário escolheu a Sakura";
            default -> "Escolha inválida, números válidos (1, 2, 3).";
        };
        System.out.println(personagem);
        sc.close();

    }
}
