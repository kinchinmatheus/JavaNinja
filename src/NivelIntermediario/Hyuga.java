package NivelIntermediario;

public class Hyuga extends Ninja {

    public void DestruirMentes() {
        System.out.println("Eu sou " + nome + " e eu destrui sua mente!");
    }

    public Hyuga(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("E eu sou pika!");
    }

}
