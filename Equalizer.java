package oraimunka02.pkg22;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        kiir();
    }

    private static void kiir() {
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            int mennyi = rnd.nextInt(7-3+1)+3;
            String szoveg = "\u001B[45m" + " ";
            String ki = "";
            for (int j = 0; j < mennyi; j++) {
                ki += szoveg;
            }
            System.out.println(ki);
        }
    }
}
