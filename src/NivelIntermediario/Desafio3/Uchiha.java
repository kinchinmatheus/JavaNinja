package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Essas são as informações do Ninja: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nivel Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }


}
