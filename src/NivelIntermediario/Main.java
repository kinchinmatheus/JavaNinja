package NivelIntermediario;

public class Main {

    public static void main(String[] args) {

        Hokages Hashirama = new Hokages("Hashirama Senju",45, true);
        Hashirama.mostrarInformacoes();
        System.out.printf("\n");

        Hokages Tobirama = new Hokages("Tobias",33,true);
        Tobirama.mostrarInformacoes();
        System.out.printf("\n");

        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.idade);
        System.out.printf("\n");

        Hokages Minato = new Hokages("Minato Namikaze",32,false);
        Minato.mostrarInformacoes();
        System.out.printf("\n");

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",17);
        Naruto.mostrarInformacoes();
        Naruto.ModoSabio();
        System.out.printf("\n");

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        Sasuke.SharinganAtivado();
        System.out.printf("\n");

        Haruno Sakura = new Haruno("Sakura Haruno", "Aldeia da Folha", 18);
        Sakura.AtivarCura();
        System.out.printf("\n");

        Hyuga Hinata = new Hyuga("Hinata Hyuga", "Aldeia da Folha", 16);
        Hinata.DestruirMentes();
        Hinata.habilidadeEspecial();
        System.out.printf("\n");

        Boruto Boruto = new Boruto("Boruto Hyuga Uzumaki", "Aldeia da Folha", 9);
        Boruto.ModoSabio();
        Boruto.ativarKarma();
        Boruto.ativarJougan();
        Boruto.DestruirMentes();



    }


}