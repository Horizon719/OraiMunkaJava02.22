package oraimunka02.pkg22;

public class OraiMunka0222 {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        kiir("Az elso tiz szam osszege: " + elso10SzamOsszege() + "\n");
        kiir(a + "+" + b + "=" + osszead(a, b) + "\n");
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
