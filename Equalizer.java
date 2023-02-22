package oraimunka02.pkg22;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        eq_5sorbol();
    }
    
    private static void eq_5sorbol() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }

    private static void eq() {
        Random rnd = new Random();
        
        int mennyi = rnd.nextInt(7-3+1)+3;
        String szoveg = "\u001B[45m" + " ";
        String ki = "";
        for (int j = 0; j < mennyi; j++) {
            ki += szoveg;
        }
        System.out.println(ki);
    }
    
    private static void eq(int mennyi) {
        String szoveg = "\u001B[45m" + " ";
        String ki = "";
        for (int j = 0; j < mennyi; j++) {
            ki += szoveg;
        }
        System.out.println(ki);
    }
}
