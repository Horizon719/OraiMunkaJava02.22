package oraimunka02.pkg22;

import java.util.Random;

public class qrKod {
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        qr();
        qr(true);
        qr(20);
        qr(20, true);
    }

    private static void qr() {
        qr(false);
    }
    
    private static void qr(int szeles) {
        qr(szeles, false);
    }
    
    private static void qr(boolean zoldBlokk) {
        qr(10, zoldBlokk);
    }
    
    private static void qr(int szeles, boolean zoldBlokk) {
        String sarga = "\u001B[43m" + " ";
        String ki = "";
        int szines = rnd.nextInt(100-50+1)+50;
        int magas = 5;
        if (szeles == 20){
            magas = 10;
        }
        String feher = "\u001B[0m" + " ";
        String zold = "\u001B[42m" + " " ;
        String[] sorok = {zold +zold + zold + zold + zold, 
                          zold +feher + feher + feher + zold,
                          zold + feher + zold + feher+ zold,
                          zold +feher + feher + feher + zold,
                          zold +zold + zold + zold + zold};
        
        if (zoldBlokk == true){
            if (szeles == 10){
                for (int i = 0; i < magas; i++) {
                    int j = 0;
                    while (j < szeles-5) {
                        if (szines >= 75){
                            ki += sarga;
                        }else{
                            ki += feher;
                        }
                        szines = rnd.nextInt(100-50+1)+50;
                        j++;
                    }
                    ki += sorok[i];
                    ki += "\n";
                }
                System.out.println(ki);
            } else{
                for (int i = 0; i < magas-5; i++) {
                    int j = 0;
                    while (j < szeles-5) {
                        if (szines >= 75){
                            ki += sarga;
                        }else{
                            ki += feher;
                        }
                        szines = rnd.nextInt(100-50+1)+50;
                        j++;
                    }
                    ki+= sorok[i];
                    ki += "\n";
                }
                for (int i = 0; i < magas-5; i++) {
                    int j = 0;
                    while (j < szeles) {
                        if (szines >= 75){
                            ki += sarga;
                        }else{
                            ki += feher;
                        }
                        szines = rnd.nextInt(100-50+1)+50;
                        j++;
                    }
                    ki += "\n";
                }
                System.out.println(ki);
            }
        } else{
            for (int i = 0; i < magas; i++) {
                    int j = 0;
                    while (j < szeles) {
                        if (szines >= 75){
                            ki += sarga;
                        }else{
                            ki += feher;
                        }
                        szines = rnd.nextInt(100-50+1)+50;
                        j++;
                    }
                    ki += "\n";
                }
                System.out.println(ki);
            }
        
    }
}
