package NivelFacil.Exercicios;

public class LimiteDeChakra {

    static void main() {

        int chakra = 100;
        int clonesDesejados = 40;

        for (int i = 1; i <= clonesDesejados ; i++) {
            if(chakra <= 0) {
                System.out.println("O Chakra acabou e o Naruto desmaiou!");
                break;
            }

            if (i % 5 == 0) {
                chakra = chakra - 20;
                System.out.println("Você é um Clone das Sombras Superior!  Você tem " + chakra + " de chakra restante");
            } else {
                chakra = chakra - 5;
                System.out.println("Você é um Clone normal. Você tem " + chakra + " de chakra restante");
            }

        }






    }
}
