package NivelIntermediario;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    // No args constructor
    public Hokages() {
    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    // All args constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
