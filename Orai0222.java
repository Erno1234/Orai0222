
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
        szoveg = String.format("%d + %d + %d= %f\n",a,b,a, gyok);
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
        osszeg = Math.sqrt(osszead(2, osszead(3,4))); 
        double gyok = Math.sqrt(osszeg);
    }

    private static void feladatok() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
