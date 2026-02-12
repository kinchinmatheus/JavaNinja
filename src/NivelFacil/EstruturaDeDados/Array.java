package NivelFacil.EstruturaDeDados;

public class Array {
    static void main() {

        String[] ninja = new String[4];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";
        ninja[3] = "Hinata";

        int[] idade = new int[2];
        idade[0] = 15;
        idade[1] = 18;

        ninja = new String[2];
        ninja[0] = "Matheus";
        ninja[1] = "Ana";

        for (int i = 0; i < 2; i++) {
            System.out.println(ninja[i]);
        }







    }

}
