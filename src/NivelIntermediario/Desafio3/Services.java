package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Services {

    Scanner sc = new Scanner(System.in);

    public boolean continuarNoSistema() {
        System.out.println("Deseja continuar no Sistema? (Sim/Nao) ");
        String resposta = sc.nextLine();
        return resposta.equalsIgnoreCase("Sim");
    }
}
