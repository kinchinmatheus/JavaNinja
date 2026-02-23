package Desafios.Desafio4;

public class NinjaAvancado extends NinjaBasico {

    String especialidade;

    public NinjaAvancado(String nome, String aldeia, TipoHabilidade habilidade, int idade, String especialidade) {
        super(nome, aldeia, habilidade, idade);
        this.especialidade = especialidade;

    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade: " + especialidade);
    }
}
