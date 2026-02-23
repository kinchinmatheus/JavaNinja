package Desafios.Desafio4;

public class NinjaBasico implements Ninja{

    String nome;
    String aldeia;
    TipoHabilidade habilidade;
    int idade;

    public NinjaBasico() {}

    public NinjaBasico(String nome, String aldeia, TipoHabilidade habilidade, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public String executarHabilidade() {
        return "\nExecutando habilidade do " +nome+ ": " + habilidade + "\n";
    }
}
