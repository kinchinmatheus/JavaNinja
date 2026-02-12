package NivelFacil.Desafios;

public class Desafio1 {
    static void main() {

        String ninja1 = "Naruto";
        int idadeNinja1 = 15;
        String missaoNinja1 = "Matar o alvo";
        String statusDeConclusao1 = "Em andamento";
        char dificuldade1 = 'S';

        if (idadeNinja1 < 15) {
            if (dificuldade1 == 'C' || dificuldade1 == 'D') {
                statusDeConclusao1 = "Concluída";
            }else {
                statusDeConclusao1 = "Não concluída";
            }
        } else {
            statusDeConclusao1 = "Concluída";
        }

        String ninja2 = "Sasuke";
        int idadeNinja2 = 12;
        String missaoNinja2 = "Correr na velocidade da luz";
        String statusDeConclusao2 = "Em andamento";
        char dificuldade2 = 'A';

        if (idadeNinja2 < 15) {
            if (dificuldade2 == 'C' || dificuldade2 == 'D') {
                statusDeConclusao2 = "Concluída";
            }else {
                statusDeConclusao2 = "Não concluída";
            }
        } else {
            statusDeConclusao2 = "Concluída";
        }

        String ninja3 = "Sakura";
        int idadeNinja3 = 18;
        String missaoNinja3 = "Ser bonita";
        String statusDeConclusao3 = "Em andamento";
        char dificuldade3 = 'D';

        if (idadeNinja3 < 15) {
            if (dificuldade3 == 'C' || dificuldade3 == 'D') {
                statusDeConclusao3 = "Concluída";
            }else {
                statusDeConclusao3 = "Não concluída";
            }
        } else {
            statusDeConclusao3 = "Concluída";
        }

        System.out.println("Informações Ninja 1");
        System.out.println("Nome: " + ninja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1 + " || Dificuldade: "+ dificuldade1);
        System.out.println("Status de conclusão: " + statusDeConclusao1);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Informações Ninja 2");
        System.out.println("Nome: " + ninja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2 + " || Dificuldade: "+ dificuldade2);
        System.out.println("Status de conclusão: " + statusDeConclusao2);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("Informações Ninja 3");
        System.out.println("Nome: " + ninja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3 + " || Dificuldade: "+ dificuldade3);
        System.out.println("Status de conclusão: " + statusDeConclusao3);

    }
}
