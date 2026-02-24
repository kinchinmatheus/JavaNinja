package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void SharinganAtivado() {

        System.out.println("Eu sou " + nome + " e eu ativei o Sharingan!");
    }

}
