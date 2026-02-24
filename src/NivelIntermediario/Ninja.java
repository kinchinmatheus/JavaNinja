package NivelIntermediario;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void habilidadeEspecial() {
        System.out.println("Eu sou " + nome + " e esse é meu ataque!");
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " +  nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " +  idade);

    }

}

