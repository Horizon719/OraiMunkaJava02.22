package oraimunka02.pkg22;

import java.util.Random;

public class Equalizer {
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        eq_5sorbol();
    }
    
    private static void eq_5sorbol() {
        eq();
        eq(12, true);
        eq();
        eq(8);
        eq(true);
    }

    private static void eq() {
        eq(false);
    }
    
    private static void eq(int mennyi) {
        eq(mennyi, false);
    }
    
    private static void eq(boolean dbKiir) {
        eq(rnd.nextInt(7-3+1)+3, dbKiir);
    }
    
    private static void eq(int mennyi, boolean dbKiir) {
        String szoveg = "\u001B[45m" + " ";
        String ki = "";
        int i = 0;
        while (i < mennyi) {
            ki += szoveg;
            i++;
        }
        if (dbKiir == true){
            System.out.println(ki + "\u001B[0m (%d)".formatted(i));
        } else{
            System.out.println(ki);
        }
    }
}
