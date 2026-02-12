package NivelFacil.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do Ninja: ");
        String nomeDoNinja = sc.nextLine();
        System.out.println("Insira a idade do Ninja: ");
        int idadeDoNinja = sc.nextInt();

        System.out.println("O nome do Ninja é: " + nomeDoNinja);
        System.out.println("A idade do Ninja é: " + idadeDoNinja + " anos");

        if (idadeDoNinja >= 18) {
            System.out.println("Esse Ninja é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse Ninja é menor de idade, ele precisa treinar mais antes de sair da vila.");
        }



        sc.close();

    }

}

