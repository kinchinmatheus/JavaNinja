package NivelIntermediario;

public class Haruno extends Ninja {

    public Haruno(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void AtivarCura() {
        System.out.println("Eu sou " + nome + " e eu ativei a Cura!");

    }

}
