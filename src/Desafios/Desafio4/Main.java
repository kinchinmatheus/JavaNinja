package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        // Naruto agora usa o Enum NINJUTSU
        NinjaBasico naruto = new NinjaBasico("Naruto Uzumaki", "Folha",TipoHabilidade.NINJUTSU,17);
        naruto.mostrarInformacoes();
        System.out.println(naruto.executarHabilidade());

        System.out.println("-------------------------");

        // Pain com RINNENGAN via Enum
        NinjaAvancado pain = new NinjaAvancado("Pain", "Chuva", TipoHabilidade.RINNEGAN,18, "Shinra Tensei");
        pain.mostrarInformacoes();
        System.out.println(pain.executarHabilidade());
    }
}