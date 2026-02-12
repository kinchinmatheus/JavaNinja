package NivelFacil.Condicoes;

import java.util.Scanner;

public class Ternarios {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o nome do Ninja?");
        String nome = sc.nextLine();
        System.out.println("Qual a idade do Ninja?");
        int idade = sc.nextInt();
        System.out.println("Qual o número de missões?");
        short numeroDeMissoes = sc.nextShort();

        String rank = (numeroDeMissoes >= 20 && idade >= 18) ? "Jounin"
                    : (numeroDeMissoes >= 10 && idade > 15) ? "Chunnin"
                    : "Noob";
        System.out.printf("%s seu rank é: %s%n ", nome, rank);



        sc.close();

    }
}
