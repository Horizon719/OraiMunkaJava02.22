package oraimunka02.pkg22;

public class OraiMunka0222 {

    public static void main(String[] args) {
        elso10();
    }
    
    private static void elso10(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            osszead(osszeg, i);
        }
        kiir(osszeg);
    }

    private static void kiir(int osszeg){
        System.out.println("Az elso 10 szam osszege: " + osszeg);
    }
    
    private static int osszead(int a, int b){
        return a += b;
    }
    
}
