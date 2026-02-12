package NivelFacil.EstruturaDeDados;

public class Array2D {

    static void main() {

        String[][] ninjaEaldeia = new String[2][3];

        ninjaEaldeia[0][0] = "Konoha";
        ninjaEaldeia[0][1] = "Naruto";
        ninjaEaldeia[0][2] = "Sasuke";

        ninjaEaldeia[1][0] = "Deserto";
        ninjaEaldeia[1][1] = "Gaara";
        ninjaEaldeia[1][2] = "Temari";

        for (int i = 0; i < ninjaEaldeia.length; i++) {
            System.out.println("Aldeia: " + ninjaEaldeia[i][0] + " | Ninja: " + ninjaEaldeia[i][1] + ", " + ninjaEaldeia[i][2]);
        }

        }


    }


