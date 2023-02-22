
package orai0222;


public class Orai0222 {


    public static void main(String[] args) {
        feladatok();
        int osszeg = elso10SzamOsszege();
        String szoveg = String.format("az elso 10 szam osszege: %d", osszeg );
        kiiras(szoveg+"\n");
        
        int a = 5;
        int b = 22;
        
        szoveg = String.format("%d + %d + %d + %d = %d\n", a, b,a,b, a + b + a + b);
        kiiras(szoveg);
        
        kiiras(szoveg);
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }

    private static int osszead(int a, int b) {
        return a+b;
    }

    private static void kiiras(String eredmeny) {
        System.out.println(eredmeny);
    }

    private static void gyok() {
        int osszeg = elso10SzamOsszege();
        osszeg =(int) Math.sqrt(osszead(2, osszead(3,4))); 
        kiiras("2+3+4 gyoke="+osszeg+"\n");
    }

    private static void feladatok() {
        elso10SzamOsszege();
        osszead();
        gyok();
    }
    
    
}
