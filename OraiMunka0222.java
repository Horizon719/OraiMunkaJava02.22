package oraimunka02.pkg22;

public class OraiMunka0222 {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 6;
        int d = 7;
        int osszeg1 = osszead(a, b);
        int osszeg2 = osszead(c, d);
        int osszeg3 = osszead(osszeg1, c);
        kiir("Az elso tiz szam osszege: " + elso10SzamOsszege() + "\n");
        kiir(a + "+" + b + "=" + osszead(a, b) + "\n");
        kiir(a + "+" + b + + c + d + "=" + osszead(osszeg1, osszeg2) + "\n");
        kiir("Az a + b + c gyöke=" + Math.sqrt(osszeg3) + "\n");
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int a, int b){
        return a + b;
    }
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
    
}
